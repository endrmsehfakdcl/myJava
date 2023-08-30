package exam14to18;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println("원 면적 : " + calc.areaCircle(r));
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}

}
