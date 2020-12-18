package chapter01;

public class Q11 {

	public static void main(String[] args) {
		final int BIRTH_PER_SECOND = 7;
		final int DEATH_PER_SECOND = 13;
		final int IMMIGRANT_PER_SECOND = 45;
		final double SECOND_IN_YEAR = 3600 * 24 * 365;

		double currentPopulation = 312_032_486;
		double changeInYear = (SECOND_IN_YEAR / BIRTH_PER_SECOND) + (SECOND_IN_YEAR / IMMIGRANT_PER_SECOND)
				- (IMMIGRANT_PER_SECOND / DEATH_PER_SECOND);

		System.out.println("Current population is " + (int) currentPopulation);	
		currentPopulation += changeInYear;
		System.out.println("Population  after 1 year is " + (int) currentPopulation);
		currentPopulation += changeInYear;
		System.out.println("Population  after 2 year is " + (int) currentPopulation);
		currentPopulation += changeInYear;
		System.out.println("Population  after 3 year is " + (int) currentPopulation);
		currentPopulation += changeInYear;
		System.out.println("Population  after 4 year is " + (int) currentPopulation);
		currentPopulation += changeInYear;
		System.out.println("Population  after 5 year is " + (int) currentPopulation);
		
	}

}
