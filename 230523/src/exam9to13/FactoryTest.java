package exam9to13;

public class FactoryTest {

	public static void main(String[] args) {
		Factory fc = Factory.getInstance();

//		Product pd = fc.createProduct(); // return new Product();
//		System.out.println(pd.getProduct()); // return productNum;

		Product[] product = new Product[10];

		for (int i = 0; i <product.length ; i++) {
			product[i] = fc.createProduct();
			System.out.println(product[i].getProduct());
		}

//		Product pd1 = fc.createProduct();
//		Product pd2 = fc.createProduct();
//		Product pd3 = fc.createProduct();
//		Product pd4 = fc.createProduct();
//		Product pd5 = fc.createProduct();
//		System.out.println(pd1.getProduct());
//		System.out.println(pd2.getProduct());
//		System.out.println(pd3.getProduct());
//		System.out.println(pd4.getProduct());
//		System.out.println(pd5.getProduct());
//		System.out.println(pd1);
//		System.out.println(pd5);
	}

}
