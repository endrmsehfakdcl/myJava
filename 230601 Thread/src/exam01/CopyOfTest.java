package exam01;

import java.util.Arrays;

public class CopyOfTest {
	public static void main(String[] args) {
		double[] org = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double[] cpy = new double[3];

		cpy = Arrays.copyOf(org, org.length);

//		for (double d : cpy) {
//			System.out.print(d + ",");
//		}
		print(cpy);

		cpy = Arrays.copyOf(org, 3);

//		for (double d : cpy) {
//			System.out.print(d + ", ");
//		}
		print(cpy);

		cpy = Arrays.copyOfRange(org, 1, 4);
		print(cpy);

//		System.arraycopy(org, 1, cpy, 1, 3); // ArrayIndexOutOfBoundException
		System.arraycopy(org, 1, cpy, 1, 2);
		print(cpy);

	}

	public static void print(double[] cpy) {
		for (double d : cpy) {
			System.out.print(d + ", ");
		}
		System.out.println();
	}
}
