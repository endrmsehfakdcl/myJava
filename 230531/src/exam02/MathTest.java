package exam02;

public class MathTest {

	public static void main(String[] args) {

		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("Math.abs(-5) = " + v1);
		System.out.println("Math.abs(-3.14) = " + v2);

		System.out.println("Math.ceil(5.3) = " + Math.ceil(5.3));
		System.out.println("Math.ceil(-5.7) = " + Math.ceil(-5.7));

		System.out.println("Math.floor(5.3) = " + Math.floor(5.3));
		System.out.println("Math.floor(-5.7) = " + Math.floor(-5.7));

		System.out.println("Math.max(-5.3, 5.3) = " + Math.max(-5.3, 5.3));
		System.out.println("Math.min(-5.3, 5.3) = " + Math.min(-5.3, 5.3));

		System.out.println("Math.random() = " + Math.random());

		System.out.println("Math.rint() = " + Math.rint(5.3));
		System.out.println("Math.rint() = " + Math.rint(5.6));

		System.out.println("Math.round() = " + Math.rint(5.3));
		System.out.println("Math.round() = " + Math.rint(5.6));

		double value = 12.3456;
		double temp1 = value * 100; // 1234.56
		long temp2 = Math.round(temp1); // 1235
		double v4 = temp2 / 100.0; // 12.35
		System.out.println(v4);

		// 주사위 눈 뽑기
		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);

	}

}
