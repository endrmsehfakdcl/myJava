package interfaceEx.kjh;

public class Notebook implements Controllabe {
	// field

	// construct

	// method
	@Override
	public void turnOn() {
		System.out.println("Notebook을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Notebook을 끈다.");
	}

	@Override
	public void repair() {
		System.out.println("장비를 수리한다.");
	}

	@Override
	public void initialize() {
		System.out.println("장비를 초기화한다.");

	}
}
