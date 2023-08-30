package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {
	public static void main(String[] args) {
		List<String> list1 = List.of("안녕, 자바!", "잘 가, C++");

		Stream<String> s1 = list1.stream();
		Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));

//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			Type mismatch: cannot convert from Stream<Object> to Stream<String>
//			at exam03.FlatMapTest.main(FlatMapTest.java:13)
//		Stream<String> s2 = s1.map(s -> Arrays.stream(s.split(" ")));

		s2.forEach(Util::printWithParenthesis);
		System.out.println();

		List<String> list2 = List.of("좋은 아침");
		List<String> list3 = List.of("안녕! 람다", "환영!, 스트림");
		Stream<List<String>> s3 = Stream.of(list1, list2, list3);
		Stream<String> s4 = s3.

				flatMap(list -> {
					if (list.size() > 1) {
						return list.stream();
					} else {
						return Stream.empty();
					}
				});
		s4.forEach(Util::printWithParenthesis);
	}
}
