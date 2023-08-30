package java_exam_05;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		for (int i = 0; i < books.length; i++) {
			books[i] = new Book();
		}

		books[0].price = 15000;
		books[1].price = 50000;
		books[2].price = 20000;

		System.out.println("정렬 전");
		for (int i = 0; i < books.length; i++) {
			books[i].showPrice();
		}

		int tmp;
		for (int j = books.length - 1; j >= 0; j--) {
			for (int i = 0; i < j; i++) {
				if (books[i].price > books[i + 1].price) {
					tmp = books[i].price;
					books[i].price = books[i + 1].price;
					books[i + 1].price = tmp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < books.length; i++) {
			books[i].showPrice();
		}

	}

}
