package exam02;

public class MainThreadTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(calc);
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user1.start();
		user2.start();
	}

}
