package exam04_after_generic;

public class BoxTest {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox.setObj(new Apple());
		oBox.setObj(new Orange());

		Apple apple = aBox.getObj();
		Orange orange = oBox.getObj();

		System.out.println(apple);
		System.out.println(orange);
//		-------------------------------------------------------------
//		aBox.setObj("Apple"); // The method setObj(Apple) in the type Box<Apple> is not applicable for the
//								// arguments (String)
//		oBox.setObj("Orange"); // The method setObj(Orange) in the type Box<Orange> is not applicable for the
//								// arguments (String)
//
//		apple = (Apple) aBox.getObj();
//		orange = (Orange) oBox.getObj();
//
//		System.out.println(apple);
//		System.out.println(orange);
	}
}
