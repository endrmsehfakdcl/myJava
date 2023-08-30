package exam01;

import java.io.IOException;
import java.util.Scanner;

public class InputExample {
	
	public static void main(String[] args) throws IOException {
//		int keyCode = System.in.read(); // 한글자 반환
//		System.out.println(keyCode);
		
		int i = 10;
		boolean result = (i==10) ;
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		boolean result1 = (inputData == "10"); //false
		System.out.println(inputData);
		System.out.println(result1);
		boolean result2 = (inputData.equals("10")); //true;객체들은 equals로 
		System.out.println(result2);
	}

}
