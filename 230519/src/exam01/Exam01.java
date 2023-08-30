package exam01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 1. 키보드로 입력한 정수가 19이상이면 성년 아니면 미성년을 출력하는 프로그램을 ifelfse문을 이용해 작성
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}

	}

}
