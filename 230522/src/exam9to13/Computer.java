package exam9to13;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// 값을 직접 넣기위한 가변형
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
//		System.out.println("sum2입니다.");
	}
}
