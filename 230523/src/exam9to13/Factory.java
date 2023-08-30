package exam9to13;

public class Factory {
	// 필드
	private static Factory fc = new Factory();

	// 생성자
	private Factory() {
	}

	// 메소드
	static Factory getInstance() {
		return fc;
	}

	public Product createProduct() {
		return new Product();
	}
}
