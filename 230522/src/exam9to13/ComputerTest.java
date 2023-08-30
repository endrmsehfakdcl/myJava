package exam9to13;

public class ComputerTest {

	public static void main(String[] args) {
		// 객체 생성
		Computer com = new Computer();

		// 배열
		int[] values1 = { 10, 20, 30 };
		int result = com.sum1(values1);
		System.out.println(result);

		// 배열 new int[] {};
		int result2 = com.sum1(new int[] { 100, 150, 200 });
		System.out.println(result2);

		// 직접 값을 넣는 경우1
		System.out.println(com.sum2(1, 2, 3));

		// 직접 값을 넣는 경우2
		int result3 = com.sum2(100, 150, 200, 250, 300);
		System.out.println(result3);
	}

}
