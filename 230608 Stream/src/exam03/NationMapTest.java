package exam03;

import java.util.stream.Stream;

public class NationMapTest {
	public static void main(String[] args) {

		Stream<Nation> n1 = Nation.nations.stream();
		Stream<String> s1 = n1.map(Nation::getName);
		s1.limit(4).forEach(Util::printWithParenthesis);
		System.out.println();

		Stream<Nation> n2 = Nation.nations.stream();
		Stream<Integer> s2 = n2.map(Nation::getGdpRank);
		s2.forEach(Util::print);

	}
}
