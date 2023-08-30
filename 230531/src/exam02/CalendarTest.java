package exam02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// static Calendar getInstance() Gets a calendar using the default time zone and
		// locale.
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);

		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
			break;
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(min + "분 ");
		System.out.print(sec + "초");

	}

}
