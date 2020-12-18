package chapter05;

public class Q07 {

	public static void main(String[] args) {

		int tuition = 10000;
		int total = 0;
		int tenthYearTuition = 0;

		for (int i = 0; i <= 14; i++) {
			tuition += tuition * 0.05;

			if (i == 10)
				tenthYearTuition = tuition;

			if (i > 10)
				total += tuition;

		}
		
		System.out.println("The tuition after ten year is " + tenthYearTuition);
		
		System.out.println("Total cost for four years' worth of tuition after the tenth year: " + total);
	}

}
