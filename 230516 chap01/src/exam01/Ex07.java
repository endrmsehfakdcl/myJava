package exam01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		System.out.print("0부터 999사이의 정수를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		int i999 = scanner.nextInt();
		int sum = 0;
		sum = i999 / 100 + i999 % 100 / 10 + i999 % 100 % 10;
		System.out.println("각 자릿수의 합은 : " + sum);
	}
}
