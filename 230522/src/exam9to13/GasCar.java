package exam9to13;

public class GasCar { // 방구차

	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) { //while문 안에서 계속 반복
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return; //void() 이기 때문에 종료
			}
		}
	}
}
