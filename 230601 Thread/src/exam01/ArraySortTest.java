package exam01;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int[] ary1 = { 1, 5, 6, 8, 9, 2, 3 };
		double[] ary2 = { 1.1, 2.2, 6.5, 7.2, 1.3 };

		Arrays.sort(ary1);
		Arrays.sort(ary2);
		print(ary1);
		print(ary2);

	}
	static void print(int[] cpy) {
		for (double d : cpy) {
			System.out.print(d + ", ");
		}
		System.out.println();
	}
	
	static void print(double[] cpy) {
		for (double d : cpy) {
			System.out.print(d + ", ");
		}
		System.out.println();
	}
}
