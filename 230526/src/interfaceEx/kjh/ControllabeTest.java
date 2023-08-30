package interfaceEx.kjh;

public class ControllabeTest {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer computer = new Computer();
		Notebook notebook = new Notebook();

		tv.turnOn(); // TV를 켠다.
		tv.turnOff(); // TV를 끈다.
		tv.repair(); // 장비를 수리한다.
		computer.turnOn(); // Computer를 켠다.
		computer.turnOff(); // Computer를 끈다.
		computer.repair(); // 장비를 수리한다.
		computer.initialize(); // 장비를 초기화한다.
	}

}
