package exam9to13;

public class Product {
	// 필드
	private static int serialNum = 10000;
	private int productNum;

	// 생성자
	public Product() {
		serialNum++;
		productNum = serialNum;
	}

	// 메소드
	public int getProduct() {
		return productNum;
	}
}
