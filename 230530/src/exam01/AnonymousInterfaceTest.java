package exam01;

public class AnonymousInterfaceTest {
 
	public static void main(String[] args) {
		AnonymousInterface anony = new AnonymousInterface();
		anony.field.turnOn();
		anony.field.turnOff();

		anony.method1();

		anony.method2(new RemoteControl() {
			// 익명
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다");
			}
		});

	}

}
