package exam07;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect1Test {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		double avg = s1.collect(Collectors.averagingDouble(Nation::getPopulation));
		System.out.println("인구 평균 : " + avg + "백만 명");
//		---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		System.out.println("나라 갯수 : " + s1.collect(Collectors.counting()));
//		---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		String name = s1.limit(4).map(Nation::getName).collect(Collectors.joining("-"));
		System.out.println("4개 나라 : " + name);
//		---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		Optional<Double> max = s1.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compare));
		System.out.println("최대 인구 나라의 인구수 : " + max.get() + " 백만 명");
//		---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		IntSummaryStatistics sta = s1.collect(Collectors.summarizingInt(x -> x.getGdpRank()));
		System.out.println(sta);
	}
}
