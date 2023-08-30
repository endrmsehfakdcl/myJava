package exam01;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.minusMinutes(20);

		System.out.println(mt);

		LocalDateTime today = LocalDateTime.of(2023, 07, 10, 11, 20);
		System.out.println(today);

		LocalDateTime flight1 = LocalDateTime.of(2023, 07, 15, 10, 15);
		LocalDateTime flight2 = LocalDateTime.of(2023, 07, 14, 15, 15);

		// 빠른 항공권 선택
		LocalDateTime myFlight;
		if (flight1.isBefore(flight2)) {
			myFlight = flight1;
		} else {
			myFlight = flight2;
		}
		System.out.println(myFlight);

		// 빠른 항공편의 비행 탑승시간까지 남은 시간
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		System.out.println(day);
		Duration between = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		System.out.println(between);
	}
}
