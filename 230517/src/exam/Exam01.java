package exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
// 01. 키보드로 입력 받은 정수의 제곱 값을 출력하는 프로그램을 작성하시오.
		System.out.println("-----------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = scanner.nextInt();
		System.out.println(i + "의 제곱은 " + i * i);
		System.out.println("-----------------------------------------------");
// 02. 원기둥의 부피를 구하는 프로그램을 작성하시오.
		double pi = 3.14;
		System.out.print("원기둥의 밑면 반지름은? ");
		double r = scanner.nextDouble();
		System.out.print("원기둥의 높이는? ");
		double h = scanner.nextDouble();
		System.out.println("원기둥의 부피는 : " + pi * r * r * h);
		System.out.println("-----------------------------------------------");
//03 . 초를입력하면 시간 분 초로 환산해 출력하는 프로그램을 작성하라.
		System.out.print("초 단위 정수를 입력하세요 : ");
		int sec = scanner.nextInt();
		int hour = sec / 3600;
		int minute = sec % 3600 / 60;
		int second = sec % 3600 % 60;
		System.out.printf("%d시간 %d분 %d초\n", hour, minute, second);
		System.out.println("-----------------------------------------------");
//04. 임의의 소문자로 초기화된 char타입 변수c를 대문자로 출력하는 프로그램을 ㅈ작성하라.
// int(A) - int(a) 차이를 이용하라 -32
		System.out.print("소문자를 입력하시오 : ");
		char c = scanner.next().charAt(0);
		char C = (char) ((int) c - 32);
		System.out.println("대문자는 " + C);
		System.out.println("-----------------------------------------------");
//05. 키보드로 화씨온도를 입력받아 섭씨온도로 출력하는 프로그램을 작성하시오.
// c = 5/9(F-32)
		System.out.print("화씨온도를 입력하시오 : ");
		double F = scanner.nextDouble();
		double Celsius = (double) 5 / 9 * (F - 32);
		System.out.printf("섭씨온도는 %.2f'C입니다.\n", Celsius);
		System.out.println("-----------------------------------------------");
//06. 키보드로 정수를 입력받아 4와 5로 나누어지는지. 4또는 5로 나우어지는지 4나 5중 하나로 나누어지지만 두 수 모두로는 나누어지지 안흔ㄴ지ㄴ를 true/false로 출력하는 프로그램을 작성하라
		System.out.print("정수를 입력하시오 : ");
		int integer = scanner.nextInt();
		System.out.println("4와 5로 나누어지는가 " + (integer % 4 == 0 & integer % 5 == 0));
		System.out.println("4 또는 5로 나누어지는가 " + (integer % 4 == 0 | integer % 5 == 0));
		System.out.println("4 나 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는가 " + (integer % 4 == 0 ^ integer % 5 == 0));
		System.out.println("-----------------------------------------------");
//07. 키보드로 0부터 999사이의 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램을 작성하라.
//ex 0~999사이의 숫자를 입력하세요 : 194
//ex 각 자릿수의 합
		System.out.print("0부터 999사이의 정수를 입력하시오 : ");
		int i999 = scanner.nextInt();
		int sum = 0;
		sum = i999 / 100 + i999 % 100 / 10 + i999 % 100 % 10;
		System.out.println("각 자릿수의 합은 : " + sum);
		System.out.println("-----------------------------------------------");
//08. 대학을 졸업하려면 최소 140학점을 이수해야 한다고 하자.
		System.out.print("전공 이수 학점 : ");
		int major = scanner.nextInt();
		System.out.print("교양 이수 학점 : ");
		int minor = scanner.nextInt();
		System.out.print("일반 이수 학점 : ");
		int normal = scanner.nextInt();

		if (major + minor + normal >= 140 & major >= 70 & ((minor >= 30 & normal >= 30) | minor + normal >= 80)) {
			System.out.println("졸업가능");
		} else {
			System.out.println("졸업불가능");
		}
		System.out.println("-----------------------------------------------");
//09 . 1부터 100까지 출력하고 거꾸로 100에서 1까지 출력하는 프로그램
		int token = 1;
		System.out.print("1부터 100까지 출력: ");
		while (token <= 100) {
			System.out.print(token + " ");
			token++;
		}
		System.out.println();
		token = 100;
		System.out.print("100부터 1까지 출력: ");
		do {
			System.out.print(token + " ");
			token--;
		} while (token >= 1);
		System.out.println();
		System.out.println("-----------------------------------------------");
//10. 100이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 그 수들의 합을 구해 출력하는 프로그램을 while문을 이용해서 작성
		int nature = 1;
		sum = 0;
		System.out.print("2의 배수이자 7의 배수인 자연수: ");
		while (nature <= 100) {
			if ((nature % 2 == 0) & (nature % 7 == 0)) {
				System.out.print(nature + " ");
				sum += nature;
			}
			nature++;

		}
		System.out.println();
		System.out.println("2와 7의 배수인 자연수의 합 : " + sum);
		System.out.println("-----------------------------------------------");
//11. 구구단
		
//12. 다음 식
	}
}
