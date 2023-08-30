package interfaceEx.kjh;

public interface Controllabe {
	void turnOn();

	void turnOff();

//	default void repair();

	default void repair() {
		System.out.println("장비를 수리한다.");
	}

	void initialize();
	
//	default void initialize() {
//		System.out.println("장비를 초기화한다.");
//	}
}
