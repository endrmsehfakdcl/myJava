package exam01;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. 양의 정수 중 짝수 덧셈
		int po = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수를 입력하시오. 음의 정수를 입력하면 종료합니다.");
		do {
			po = scanner.nextInt();
			if (po % 2 == 0) {
				sum += po;
				System.out.println("양의 정수의 합 : " + sum);
			}

		} while (po > 0);

		System.out.println("양의 정수의 합 : " + sum);
	}

}
