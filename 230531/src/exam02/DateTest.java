package exam02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date(); // ctrl + shift + o

		// Date클래스에는 toString()이 오버라이딩 되어있다.
		String strNow = now.toString();
		System.out.println(strNow);
		System.out.println(now);

		SimpleDateFormat sdf1 = new SimpleDateFormat(); // 대문자 M은 월 , 소문자m은 분
		System.out.println(sdf1.format(now));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 대문자 M은 월 , 소문자m은 분
		System.out.println(sdf.format(now));

	}

}
