package chapter05;

public class Q27 {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE = 10;
		int leapYearCount = 0;
		
		
		for(int year = 101; year <= 2100; year++) {
			
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				leapYearCount++;
				System.out.print(year + " ");
			}
			
			if (leapYearCount % NUMBER_PER_LINE == 0)
				System.out.println();
		}
		
		System.out.println("The amount of leap years is " + leapYearCount);
	}

}
