package practice.ex08;

import java.io.File;

//01. C:/Temp/file.txt 파일의 유무를 출력하는 프로그램을 작성하시오.
public class Exam01 {
	public static void main(String[] args) {
		File file = new File("C:/Temp/file.txt");
		if (file.exists())
			System.out.println("C:/Temp/file.txt 이 있습니다.");
		else
			System.out.println("C:/Temp/file.txt 이 없습니다.");
	}
}
