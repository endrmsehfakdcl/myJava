package exam06;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamTest {
	public static void main(String[] args) {

		IntStream is1 = IntStream.iterate(1, x -> x + 2);
		is1.limit(5).forEach(Util::print); // 최종연산 forEach
		System.out.println();

		IntStream is2 = new Random().ints(0, 10);
		is2.limit(5).forEach(Util::print);
		System.out.println();

		Stream<Double> ds = Stream.generate(Math::random);
		ds.limit(5).forEach(Util::print);
		System.out.println();

		IntStream is3 = IntStream.rangeClosed(1, 10);
		is3.limit(5).forEach(Util::print);
	}

}
