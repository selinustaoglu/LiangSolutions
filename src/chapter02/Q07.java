package chapter02;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		final int MINUTES_IN_DAY  = 24 * 60;
		final int MINUTES_IN_YEAR = 365 * MINUTES_IN_DAY;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int years = minutes / MINUTES_IN_YEAR;
		int leftoverDays = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;
		
		System.out.println(minutes + " minutes is approximately " + years + " yearas and " + leftoverDays + " days");
		
	}

}
