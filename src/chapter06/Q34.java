package chapter06;

import java.util.Scanner;

public class Q34 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter year
		System.out.print("Enter full year (e.g., 2001): ");
		int year = input.nextInt();

		// Prompt the user to enter month
		System.out.print("Enter month in number between 1 and 12: ");
		int month = input.nextInt();

		// Print calendar for the month of the year
		printMonth(year, month);
	}

	/** Print the calendar for a month in a year */
	public static void printMonth(int year, int month) {
		// Print the headings of the calendar
		printMonthTitle(year, month);

		// Print the body of the calendar
		printMonthBody(day, year, month);
	}

	/** Print the month title, e.g., May, 1999 */
	public static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Get the English name for the month */
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}

		return monthName;
	}

	/** Print month body */
	public static void printMonthBody(int day, int year, int month) {
		// Get start day of the week for the first date in the month
		int startDay = getStartDay(day, year, month);

		// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

	public static int getStartDay(int dayOfMonth, int year, int month) {
		if (month == 1 || month == 2) {
			month = month + 12;
			year--;
		}
		int q, m, j, k;
		q = dayOfMonth;
		m = month;			
		j = year/100;		
		k = year%100;		
		int dayOfTheWeek = (q + (26*(m+1) /10) + k + k/4 + j/4 + (5*j)) % 7;
		return dayOfTheWeek;
	}

	/** Get the total number of days since January 1, 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	/** Get the number of days in a month */
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0; // If month is incorrect
	}

	/** Determine if it is a leap year */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	public static int getLastDay(int month, int year) {
		int lastDayOfMonth;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDayOfMonth = 31;
		} else if (month == 2) {
			if (isLeapYear(year)) {
				lastDayOfMonth = 29;
			} else {
				lastDayOfMonth = 28;
			}
		} else {
			lastDayOfMonth = 30;
		}
		return lastDayOfMonth;
	}
	
	public static void printCalendarItself(int month, int year) {
		int lastDayOfMonth = getLastDay(month, year);

		for (int i = 2; i <= lastDayOfMonth; i++) {
			int printedDay = getStartDay(i, month, year);
			if (printedDay == 1) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
	}
}
