package practice.ex08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

//04. 키보드로 입력한 이름의 자바 소스 파일을 찾아 맨 앞에 행 번호를 붙여서 출력하는 프로그램을 작성하시오.
public class Exam04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String javaSrcFile = br.readLine();

		File file = new File(javaSrcFile);
		if (file.exists()) {
			try (BufferedReader br2 = new BufferedReader(new FileReader(file))) {
				int lineNum = 1;
//				while (br2.readLine() != null) {
//					System.out.println(lineNum++ + " " + br2.readLine());
//				}
				while (true) {
					String oneLine = br2.readLine();
					if (oneLine == null)
						break;
//					System.out.println(lineNum++ + " " + oneLine);
					System.out.printf("%2d %s\n",lineNum++, oneLine);
				}
			}
		} else {
			System.out.println(javaSrcFile + "은 없는 파일입니다.");
		}
	}
}
//C:\workspace\230613\src\practice\ex08\Exam01.java