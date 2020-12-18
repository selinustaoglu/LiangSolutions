package chapter05;

public class Q10 {

	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int count = 0;
		
		for (int number = 100; number <= 1000; number++) {
			if (number % 5 == 0 && number % 6 == 0) {
				System.out.print(number + " ");
				count++;
			if (count % NUMBERS_PER_LINE == 0)
				System.out.println();
			
			}
		}
	}

}
