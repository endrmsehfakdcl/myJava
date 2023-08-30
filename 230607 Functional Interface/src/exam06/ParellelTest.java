package exam06;

import java.util.stream.IntStream;

public class ParellelTest {
	public static void main(String[] args) {

		long start;
		long end;
		long total;

		IntStream sequantial = IntStream.rangeClosed(1, Integer.MAX_VALUE);
		start = System.currentTimeMillis();
		total = sequantial.sum();
		end = System.currentTimeMillis();
		System.out.println("순차처리 : " + (end - start));

		IntStream parallel = IntStream.rangeClosed(1, Integer.MAX_VALUE).parallel();
		start = System.currentTimeMillis();
		total = parallel.sum();
		end = System.currentTimeMillis();
		System.out.println("병렬처리 : " + (end - start));

	}
}
