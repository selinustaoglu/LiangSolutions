package chapter06;

import java.time.LocalDateTime;

public class Q24 {

	public static void main(String[] args) {
		System.out.print("Current time is " );
		currentTime();
		System.out.print(" and date is " + currentDay() + " ");
		currentMonth();
		System.out.print(" " + currentYear());
	}

	public static void currentTime() {
		long totalMilliseconds = System.currentTimeMillis();

	    long totalSeconds = totalMilliseconds / 1000;

	    long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;

	    long totalHours = totalMinutes / 60;

	    long currentHour = totalHours % 24;

	    System.out.print((currentHour + 1) + ":" + currentMinute + ":" + currentSecond );
	}
	
	public static int currentDay() {
		LocalDateTime now = LocalDateTime.now();
		
		int currentDay = now.getDayOfMonth();
		
		return currentDay;
	}
	
	public static void currentMonth() {
		LocalDateTime now = LocalDateTime.now();
		
		int currentMonth = now.getMonthValue();
		
		switch (currentMonth) {
		case 1: System.out.print("January");break;
		case 2: System.out.print("February");break;
		case 3: System.out.print("March");break;
		case 4: System.out.print("April");break;
		case 5: System.out.print("May");break;
		case 6: System.out.print("June");break;
		case 7: System.out.print("July");break;
		case 8: System.out.print("August");break;
		case 9: System.out.print("September");break;
		case 10: System.out.print("October");break;
		case 11: System.out.print("November");break;
		case 12: System.out.print("December");break;
		}
	}
	
	public static int currentYear() {
		LocalDateTime now = LocalDateTime.now();
		
		int currentYear = now.getYear();
		
		return currentYear;
	}
}
