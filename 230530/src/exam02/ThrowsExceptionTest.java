package exam02;

public class ThrowsExceptionTest {

	public static void main(String[] args) throws Exception {
		//1
//		try {
//			findClass()	;
//		}catch (ClassNotFoundException e)	{
//			System.out.println("클래스가 존재하지 않아요.");
//		}
		//2 throws Exception
		findClass()	;
		
	}

	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		clazz.equals(clazz);
	}

}
