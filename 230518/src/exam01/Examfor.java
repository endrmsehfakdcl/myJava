package exam01;

import java.util.Scanner;

public class Examfor {

	public static void main(String[] args) {

		// int[] arr = { 10, 5, 33, 99, 31, 51 };
//---------------------------------------------------------------------
		int[] arr;
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력받을 숫자의 갯수 : ");
		count = scanner.nextInt();
		arr = new int[count];
		System.out.print("숫자 " + count + "개를 입력하시오 : ");
		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
		}
//---------------------------------------------------------------------
		int min = minValue(arr);
		System.out.println("배열의 최솟값 : " + min);
		int max = maxValue(arr);
		System.out.println("배열의 최댓값 : " + max);

		int efmin = efminValue(arr);
		System.out.println("ef배열의 최솟값 : " + efmin);
		int efmax = efmaxValue(arr);
		System.out.println("ef배열의 최댓값 : " + efmax);
//--------------------------------------------------------------------
	}

	public static int minValue(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int efmaxValue(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public static int efminValue(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}
}