package interfaceEx.kjh;

public class Computer implements Controllabe {
	// field

	// construct

	// method
	@Override
	public void turnOn() {
		System.out.println("Computer를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끈다.");
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
