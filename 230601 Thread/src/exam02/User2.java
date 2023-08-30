package exam02;

public class User2 extends Thread {
	public Calculator calc;

	public void setCalculator(Calculator calc) {
		this.calc = calc;
		this.setName("User2");
	}

	public void run() {
		calc.setMemory(50);
	}

}
