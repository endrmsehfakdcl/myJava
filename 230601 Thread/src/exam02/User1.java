package exam02;

public class User1 extends Thread {
	private Calculator calc;

	public void setCalculator(Calculator calc) {
		this.calc = calc;
		this.setName("User1");
	}

	@Override
	public void run() {
		calc.setMemory(100);
	}

}
