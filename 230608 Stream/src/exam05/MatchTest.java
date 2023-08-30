package exam05;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchTest {
	public static void main(String[] args) {

		boolean b1 = Stream.of("a1", "b2", "c3").anyMatch(s -> s.startsWith("c"));
		System.out.println(b1); // "c3" true

		boolean b2 = IntStream.of(10, 20, 30).allMatch(p -> p % 3 == 0); 
		System.out.println(b2); // 10 20 false

		boolean b3 = IntStream.of(1, 2, 3).noneMatch(p -> p == 3);
		System.out.println(b3); // 3 false
								// .모든 getPopulation이 100.0 이상인가?
		if (Nation.nations.stream().allMatch(d -> d.getPopulation() > 100.0)) {
			System.out.println("모든 국가의 인구가 1억 이상입니다.");
		} else {
			System.out.println("모든 국가의 인구가 1억이 넘지 않아요. 끼에엑");
		}

		Optional<Nation> nation = Nation.nations.stream().findFirst();
		//     ifPresentOrElse( 있으면 출력  , 없으면 "없음")
		nation.ifPresentOrElse(Util::print, () -> System.out.println("없음")); 
		System.out.println();
		nation = Nation.nations.stream().filter(Nation::isIsland).findAny();
		
		nation.ifPresent(Util::print); 
				}
}
