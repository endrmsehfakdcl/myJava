package exam01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println(xmas);

		LocalDate eve = xmas.minusDays(1);
		System.out.println(eve);

		Period left = Period.between(today, xmas);
		System.out.println("크리스마스까지 앞으로 " + left.getMonths() + "월" + left.getDays() + "일");

		long days = ChronoUnit.DAYS.between(today, xmas);
		long weeks = ChronoUnit.WEEKS.between(today, xmas);
		System.out.println(days);
		System.out.println(weeks);
	}

}
