package exam05;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class ReduceTest {
	public static void main(String[] args) {

		// Integer타입 List
		List<Integer> numbers = List.of(5, 6, 3, 4, 7);
		// 초기값을 미리 정함
		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		// 초기값 1 // 1*5*6*3*4*7 = 2520
		int sum3 = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

		// reduce 연산인데 초기값 없으므로 Optional의 타입으로 리턴
		Optional<Integer> sum4 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum4.get());
		// reduce() 전에 Integer로 변환 // maptoInt 중간연산
		OptionalInt sum5 = numbers.stream().mapToInt(x -> x.intValue()).reduce(Integer::sum);
		System.out.println(sum5.getAsInt());
		//
		Optional<Integer> sum6 = numbers.stream().reduce((a, b) -> a * b);
		sum6.ifPresent(Util::print);
	}
}
