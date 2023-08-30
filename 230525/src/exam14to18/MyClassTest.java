package exam14to18;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass(); // MyClass.rc = new Television
		System.out.println(myClass); // 주소값
		myClass.rc.turnOn();		//television.turnOn
		myClass.rc.setVolume(5);	//television.setVolue

		System.out.println();
		MyClass myClass2 = new MyClass(new Audio()); // MyClass.myClass2 = new Audio

		System.out.println();
		myClass.methodA();	//methodA.rc2 = new Audio

		System.out.println();
		myClass.methodB(new Television()); // methodB.rc2 = new Audio
	}

}
