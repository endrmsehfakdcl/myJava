package exam9to13;

public class GasCarTest {

	public static void main(String[] args) {

		GasCar myCar = new GasCar();

		myCar.setGas(10);

		boolean gasState = myCar.isLeftGas();
		if (gasState) { // setGas(10) return true;
			System.out.println("출발합니다.");
			myCar.run(); // void run()
		}

		if (myCar.isLeftGas()) { // if((myCar.isLeftGas() = true)
			System.out.println("gas를 주입할 필요가 없어요.");
		} else { // myCar.isLeftGas() = false
			System.out.println("gas를 주입하세요.");
		}
	}
}
