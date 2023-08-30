package exam14to18;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton sg1 = new Singleton();
		
		Singleton sg1 = Singleton.getInstance();
		Singleton sg2 = Singleton.getInstance();
		Singleton sg3 = Singleton.getInstance();
		
		System.out.println(sg1);
		System.out.println(sg2);
		System.out.println(sg3);
	}

}
