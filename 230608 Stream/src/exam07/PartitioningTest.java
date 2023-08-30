package exam07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningTest {
	public static void main(String[] args) {
		Stream<Nation> s1 = Nation.nations.stream().limit(4);
		Map<Boolean, List<Nation>> m1 = s1.collect(
				Collectors.partitioningBy(p -> p.getType() == Type.LAND));
		System.out.println(m1);
		// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream().limit(4);
		Map<Boolean, Long> m2 = s1.collect(
				Collectors.partitioningBy(p -> p.getType() == Type.LAND, 
				Collectors.counting()));
		System.out.println(m2);
		// ---------------------------------------------------------------------------------
		s1 = Nation.nations.stream().limit(4);
		Map<Boolean, String> m3 = s1.collect(
				Collectors.partitioningBy(p -> p.getType() == Type.LAND,
				Collectors.mapping(Nation::getName, Collectors.joining("+"))));
		System.out.println(m3);
	}
}
