package exam05;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {

		String[] strings = { "로마에 가면 로바법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

//		Arrays.sort(strings, new Comparator<String>() { // 함수형 인터페이스 Comparator
//
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				return s1.length() - s2.length();
//			}
//			
//		});

		Arrays.sort(strings, (String s1, String s2) -> {
			return s1.length() - s2.length(); // return문 중괄호
		});

		for (String s : strings) {
			System.out.println(s);
		}
	}
}
