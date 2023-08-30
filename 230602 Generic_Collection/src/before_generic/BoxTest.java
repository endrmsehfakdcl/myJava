package before_generic;

public class BoxTest {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.setObj(new Apple());
		oBox.setObj(new Orange());

		Apple apple = (Apple) aBox.getObj();
		Orange orange = (Orange) oBox.getObj();
		
		System.out.println(apple);
		System.out.println(orange);
//		-------------------------------------------------------------
		aBox.setObj("Apple"); // 사과 객체를 넣는게 아니라 String타입 "Apple"을 넣었다.
		oBox.setObj("Orange");

		apple = (Apple) aBox.getObj(); // 문제없이 컴파일 된다.
		orange = (Orange) oBox.getObj();
		
		System.out.println(apple); // ClassCastException 클래스 캐스팅 문제가 생긴다.
		System.out.println(orange);
	}
}
