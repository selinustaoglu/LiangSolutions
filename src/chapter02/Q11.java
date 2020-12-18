package chapter02;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		final int BIRTH_PER_SECOND = 7;
		final int DEATH_PER_SECOND = 13;
		final int IMMIGRANT_PER_SECOND = 45;
		final double SECOND_IN_YEAR = 3600 * 24 * 365;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double currentPopulation = 312_032_486;
		double changeInYear = (SECOND_IN_YEAR / BIRTH_PER_SECOND) + (SECOND_IN_YEAR / IMMIGRANT_PER_SECOND)
				- (SECOND_IN_YEAR / DEATH_PER_SECOND);

		currentPopulation += changeInYear * years;
		
		System.out.println("The population in " + years + " years is " + (int) currentPopulation);
			
	}

}
