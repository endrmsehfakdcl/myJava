package practice.ex08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//07. 파일 이름을 나타내는 문자열과 특정문자를 주면 파일 속에 포함된 
//특정 문자의 개수를 찾을 수 있는 CountLetter 클래스를 두가지 방식(입출력 스트림 및 채널)으로 작성하시오.
//
//== 출력결과 : 파일을 입력하세요 : C:/Temp/words.txt
//            세고자하는 문자를 입력하세요 : e
//            C:/Temp/words.txt 파일에 e문자가 5개 있습니다.
public class Exam07 {
	public static void main(String[] args) throws Exception {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("파일을 입력하세요 : ");
			String filePath = scanner.nextLine();
//			C:/Temp/words.txt

			System.out.print("세고자 하는 문자를 입력하세요 : ");
			char countletter = scanner.nextLine().charAt(0);
			int count = 0;

			try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				while (true) {
					String oneLine = br.readLine();
					if (oneLine == null)
						break;
					for (int i = 0; i < oneLine.length(); i++) {
						if (countletter == oneLine.charAt(i))
							count++;
					}
				}
			}
			System.out.println(filePath + " 파일에 " + countletter + "문자가 " + count + "개 있습니다.");
		}
	}

}
