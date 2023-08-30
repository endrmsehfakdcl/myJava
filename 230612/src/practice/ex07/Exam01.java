package practice.ex07;

import java.util.ArrayList;
import java.util.List;

//01. 4개의 문자열 ('갈매기', '나비', '다람쥐', '라마')을 포함하는 리스트 객체를 스트림으로 생성한 후 문자열 크기가 2인 단어만 출력하는 프로그램을 작성하라.
public class Exam01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");

////		for (String s : list) {
////			if (s.length() == 2) {
////				System.out.println(s);
////			}
////		}

//		Stream<String> stream = list.stream().filter(s -> s.length() == 2).forEach(System.out::println);
//		stream.forEach(s->System.out.println(s));
		
//		Stream<String> stream = list.stream().filter(s -> s.length() == 2);
//		stream.forEach(System.out::println);
		list.stream().filter(s->s.length() ==2 ).forEach(System.out::println);


	}
}
