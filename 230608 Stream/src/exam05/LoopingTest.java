package exam05;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopingTest {
	public static void main(String[] args) {

		// Stream에는 중간 연산의 수행 결과를 디버깅할 수 있는 수단인 peek 메서드를 제공한다.
		// forEach 메서드는 최종 연산이기 때문에 결과를 확인할 수 있으나 peek 메서드는 중간 연산이기 때문에 어떠한 최종 연산도 하지
		// 않으면 아무것도 확인할 수가 없다.
		Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);
		System.out.println("-----------");
		Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));
		System.out.println();
		System.out.println(on.get());

		System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());

		sn = Nation.nations.stream();
		
		// Returns the count of elements in this stream. This is a special case ofa
		// reduction and isequivalent to:
		// return mapToLong(e -> 1L).sum();
		// This is a terminal operation.
		System.out.println("나라 갯수 : " + sn.count());

	}
}
