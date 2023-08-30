package exam01;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// 객체없이 클래스 이름만 가지고 Class 객체를 얻는 방법1
		Class clazz = Key.class;
		// 객체없이 클래스 이름만 가지고 Class 객체를 얻는 방법2
//		Class clazz2 = Class.forName("exam01.key");
//		
//		// 클래스로부터 객체가 이미 생성되이 있는 경우
//		Key key = new Key(1);
//		// Class 객체를 얻는 방법
//		Class clazz3 = key.getClass();

		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
	}

}
