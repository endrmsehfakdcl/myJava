package exam9to13;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / y; // 형 변환에 주의할 것
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
