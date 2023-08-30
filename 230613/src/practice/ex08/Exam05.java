package practice.ex08;

import java.io.IOException;
import java.io.OutputStream;

//05. OutputStream과 관련된 메소드를 이용해 0부터 9까지 
//연속된 숫자와 A부터 Z까지 알파벳 문자를 화면에 출력하는 프로그램을 작성하시오.
//Hint) 0의 아스키코드값은 '48'이며, A의 아스키코드값은 '65'이다. 
//화면은 표준 출력 장치이므로 System.out객체를 OutputStream 타입의 변수에 대입해서 사용한다.
public class Exam05 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		for (int i = 48; i < 58; i++) {
			os.write(i);
		}
		for (int i = 65; i < 91; i++) {
			os.write(i);
		}
		os.flush();
//		System.out.println();
	}
}
