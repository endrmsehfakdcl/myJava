package exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private int counter;

	public void showMenu() {
		while (true) {
			System.out.println("------------------------");
			System.out.println("1. 등록 | 2. 목록 | 3. 종료");
			System.out.println("------------------------");
			System.out.print("선택 : ");
			String selectNo = scanner.nextLine();
			switch (selectNo) {
			case "1":
				registerProduct();
				break;
			case "2":
				showProducts();
				break;
			case "3":
				return;
			}
		}

	}

	private void registerProduct() {
		Product product = new Product();

		product.setPno(++counter);
		System.out.print("상품명 : ");
//		String name = scanner.nextLine();
//		product.setName(name);
		product.setName(scanner.nextLine());
		System.out.print("가격 : ");
		product.setPrice(Integer.parseInt(scanner.nextLine()));
		System.out.print("재고 : ");
		product.setStock(Integer.parseInt(scanner.nextLine()));

		list.add(product);
	}

	private void showProducts() {
		for (Product p : list) {
			System.out.println(p); // toString 호출
		}
	}
}
