package exam02;

public class TryCatchFinallyTest {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.lang.String4");

		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않아요.");
			e.printStackTrace();
		}
	}

}
