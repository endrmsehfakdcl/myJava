package exam01;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {
	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println("시작 : " + start.getEpochSecond());
		System.out.println("Time is ...");

		int sum = 0;
		for (int i = 0; i < 1_000_000; i++) {
			sum += i;
		}

		Instant end = Instant.now();
		System.out.println("끝 : " + end.getEpochSecond());
		Duration between = Duration.between(start, end);
		System.out.println("밀리 초 단위의 시간 차이는 : " + between.toMillis());
	}
}
