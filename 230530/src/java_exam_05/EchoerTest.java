package java_exam_05;

import java.util.Scanner;

public class EchoerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작합니다.");
		while (true) {
			String echo = sc.nextLine();
//			System.out.println(echo);
			Echoer.echoer(echo);
			if (echo.charAt(0) == '끝')
				break;
		}
		System.out.println("종료합니다.");
	}
}
