package exam01;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("정수를 3개 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int sum = num1 + num2 + num3 ;
		System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum );
	}

}
