package practice.ex07;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//04. Nation.nations 리스트에서 육지에 있는 나라 이름을 콤마와 공백(", ")으로 연결하여 출력하는 프로그램을 작성하시오.
public class Exam04 {
	public static void main(String[] args) {
		Stream<Nation> stream = Nation.nations.stream();
		stream.filter(s -> s.getType() == Type.LAND).forEach(s -> System.out.print(s + ", "));

		System.out.println();
		stream = Nation.nations.stream();
//		String name = stream.filter(Nation::isIsland).map(Nation::getName)
//				.collect(Collectors.joining(", "));
		String name = stream.filter(Predicate.not(Nation::isIsland)).map(Nation::getName)
				.collect(Collectors.joining(", "));
		System.out.println(name);
	}
}
