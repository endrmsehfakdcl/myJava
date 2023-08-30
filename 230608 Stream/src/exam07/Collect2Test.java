package exam07;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect2Test {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream();
		Stream<String> ss = s1.map(Nation::getName).limit(3);
		List<String> list = ss.collect(Collectors.toList());
		System.out.println(list);
// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		Set<String> ss2 = s1.map(Nation::getName).limit(3).collect(Collectors.toSet());
		System.out.println(ss2);
// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		// Map<key, value> m1 = s1.filter<isIsland ? true: false>
		Map<String, Double> m1 = s1.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(m1);
// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream();
		Set<Nation> hashSet = s1.filter(Predicate.not(Nation::isIsland))
				.collect(Collectors.toCollection(HashSet<Nation>::new));
		System.out.println(hashSet); // hashSet을 출력하면 name만 나온다.
		hashSet.forEach(x -> Util.print("(" + x.getName() + ", " + x.getGdpRank() + ")"));

	}
}
