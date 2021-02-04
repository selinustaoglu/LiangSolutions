package chapter06;

import java.time.LocalDateTime;

public class Q24 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.print("Current time is " + currentTime() + " and date is " + currentDay(now) + " "
				+ currentMonth(now) + " " + currentYear(now));
	}

	public static String currentTime() {
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;

		return (currentHour + 1) + ":" + currentMinute + ":" + currentSecond;
	}

	public static int currentDay(LocalDateTime now) {
		int currentDay = now.getDayOfMonth();

		return currentDay;
	}

	public static String currentMonth(LocalDateTime now) {
		int currentMonth = now.getMonthValue();

		switch (currentMonth) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "";
	}

	public static int currentYear(LocalDateTime now) {
		int currentYear = now.getYear();
		return currentYear;
	}
}
