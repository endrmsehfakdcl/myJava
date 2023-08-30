package exam05;

import java.util.stream.Stream;

public class NationReduceTest {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		// 초기값 없으니까 Optional로 나옴
		s1.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2).ifPresent(Util::print);
		System.out.println();

		Stream<Nation> s2 = Nation.nations.stream();
		double sumOfPopulation = s2.filter(n -> n.getGdpRank() <= 20).mapToDouble(n -> n.getPopulation()).reduce(0.0,
				(p1, p2) -> p1 + p2);
		System.out.println("리스트에서 GDP가 20위 이하인 국가의 총 인구수는 : " + sumOfPopulation + "백만명입니다.");
	}
}
