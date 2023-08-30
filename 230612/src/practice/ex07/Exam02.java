package practice.ex07;

import java.util.Arrays;
import java.util.List;

//02. 6개의 수도("서울","워싱턴","베이징","파리","마드리드","런던")를 포함하는 List객체를 사용하여 다음을 수행하는 프로그램을 작성하라. (스트림생성 -> 정렬 -> 첫번째 원소를 찾아서 출력)
public class Exam02 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");

//		Stream<String> stream = list.stream().sorted().limit(1);
//		stream.forEach(System.out::println);
		
//		Stream<String> stream = list.stream().sorted();
//		stream.findFirst().ifPresent(System.out::println);
		list.stream().sorted().findFirst().ifPresent(System.out::println);
	}
}
