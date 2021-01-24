package chapter06;

public class Q16 {
	
	public static int numberOfDaysInAYear(int year) {
		if(isLeapYear(year)) 
			return 366;
		else
			return 365;
	}
	
	public static boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static void main(String[] args) {
		System.out.println("year     number of days\n" + "-----------------------");
		for (int i = 2000; i < 2021; i++) {
			System.out.printf("%-12d", i);
			System.out.printf("%-1d\n", numberOfDaysInAYear(i));
		}

	}

}
