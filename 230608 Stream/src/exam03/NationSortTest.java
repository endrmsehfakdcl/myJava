package exam03;

import java.util.Comparator;
import java.util.stream.Stream;

public class NationSortTest {
	public static void main(String[] args) {

		System.out.print("국가 이름순서 : \n");
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = n1.sorted(Comparator.comparing(Nation::getName));
		Stream<String> s3 = n2.map(x -> x.getName());
		s3.forEach(Util::printWithParenthesis);

		System.out.print("\n국가 GDP순서 : \n");
		Stream<Nation> n3 = Nation.nations.stream();
		Stream<Nation> n4 = n3.sorted(Comparator.comparing(Nation::getGdpRank));
		Stream<String> s5 = n4.map(Nation::getName);
		s5.forEach(Util::printWithParenthesis);
		System.out.println();
		
		Stream<String> s1 = Stream.of("d2", "a3", "j4", "r2");
		Stream<String> s2 = s1.sorted();
		s2.forEach(Util::print);
		

	}
}
