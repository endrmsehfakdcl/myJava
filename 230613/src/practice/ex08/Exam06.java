package practice.ex08;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

//06. 다음 문자열로 구성된 배열과 생성된 파일의 내용을 참고해 
//매 행마다 문자열의 첫 문자, 콜론, 문자열로 구성된 파일을 생성하는 프로그램을 작성하시오.
//PrintStream의 printf()와 println()메소드를 사용할 수 있다.
//
//String[] animals = {"ant", "bat", "cat", "dog"};
//
//== 생성된 파일의 내용 ==
//a : ant
//b : bat
//c : cat
//d : dog
public class Exam06 {
	public static void main(String[] args) throws Exception {
		String[] animals = { "ant", "bat", "cat", "dog" };

		try (PrintStream ps = new PrintStream(new FileOutputStream("C:/Temp/exam06.txt"))) {
			for (String s : animals) {
				ps.printf("%c : %s\n", s.charAt(0), s);
			}
		}
		System.out.println("매 행마다 문자열의 첫 문자, 콜론, 문자열로 구성된 파일을 생성합니다.");

		try (BufferedReader br = new BufferedReader(new FileReader("C:/Temp/exam06.txt"))) {
			System.out.println("== 생성된 파일의 내용 ==");
			while (true) {
				String oneLine = br.readLine();
				if (oneLine == null)
					break;
				System.out.println(oneLine);
			}
		}
	}
}
