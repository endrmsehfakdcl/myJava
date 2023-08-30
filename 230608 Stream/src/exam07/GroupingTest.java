package exam07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingTest {
	public static void main(String[] args) {
		// Stream으로 Nation에서 4개만 가져오기
		Stream<Nation> s1 = Nation.nations.stream().limit(4);
		// Type에 따라 grouping 하기 때문에 Map으로 처리함
		Map<Type, List<Nation>> m1 = s1.collect(
				Collectors.groupingBy(Nation::getType));
		System.out.println(m1);
		// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream().limit(4);
		// Collectors.counting 은 long타입을 반환한다.
		Map<Type, Long> m2 = s1.collect(
				Collectors.groupingBy(Nation::getType, Collectors.counting()));
		System.out.println(m2);
		// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream().limit(4);
		Map<Type, String> m3 = s1.collect(
				Collectors.groupingBy(Nation::getType, Collectors.mapping(Nation::getName, Collectors.joining(", "))));
		System.out.println(m3);
	}
}
