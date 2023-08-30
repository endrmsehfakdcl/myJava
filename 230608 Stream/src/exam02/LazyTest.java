package exam02;

import java.util.stream.IntStream;

public class LazyTest {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);

		is.filter(x -> { // 1 2` 3 4` 5
			System.out.println("filter : " + x);
			return x % 2 == 0; //2 4
		}).map(x -> {
			System.out.println("map : " + x);
			return x * x; // 4 16
		}).forEach(x -> System.out.println("for each: " + x));
	}
}
