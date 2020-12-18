package chapter05;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the first day of the year: ");
		int day = input.nextInt();
		
		String date = "";
		
		for(int month = 1; month <= 12 ; month++) {
			switch (month) {
			case 1:date = "January 1, " + year + " is ";break;
			case 2:date = "February 1, " + year + " is ";break;
			case 3:date = "March 1, " + year + " is ";break;
			case 4:date = "April 1, " + year + " is ";break;
			case 5:date = "May 1, " + year + " is ";break;
			case 6:date = "June 1, " + year + " is ";break;
			case 7:date = "July 1, " + year + " is ";break;
			case 8:date = "August 1, " + year + " is ";break;
			case 9:date = "September 1, " + year + " is ";break;
			case 10:date = "October 1, " + year + " is ";break;
			case 11:date = "November 1, " + year + " is ";break;
			case 12:date = "December 1, " + year + " is ";break;
			}
			
			switch (day) {
			case 1:date += "Monday";break;
			case 2:date += "Tuesday";break;
			case 3:date += "Wednesday";break;
			case 4:date += "Thursday";break;
			case 5:date += "Friday";break;
			case 6:date += "Saturday";break;
			case 7:date += "Sunday";break;
			}
			
			System.out.println(date);
			
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				day += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				day += 30;
			else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				day += 29;
			else 
				day += 28;
			
			day = day % 7;
		}

	}

}
