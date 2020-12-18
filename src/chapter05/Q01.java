package chapter05;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positiveCount = 0;
		int negativeCount = 0;
		int count = 0;
		int total = 0;

		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) {
			System.out.print("No numbers are entered except 0");
			//System.exit(1);
		}

		while (number != 0) {
			if (number > 0)
				positiveCount++;
			else
				negativeCount++;
			count++;
			total += number;
			number = input.nextInt();

		}
		double average = (double) total / count;

		System.out.println("The number of positives is " + positiveCount);
		System.out.println("The number of negatives is " + negativeCount);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
		
	}

}
