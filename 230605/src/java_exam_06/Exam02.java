package java_exam_06;

import java.util.ArrayList;
import java.util.List;
//02. ArrayList를 이용해 '갈매기', '나비', '다람쥐', '라마'를 원소로 입력한 후 
//	  각 원소에서 문자열 크기가 2인 단어만 출력하는 프로그램을 작성하시오.
public class Exam02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");

		for (String s : list) {
			if (s.length() == 2)
				System.out.println(s);
		}
	}
}
