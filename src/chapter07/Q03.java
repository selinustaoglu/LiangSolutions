package chapter07;

import java.util.Scanner;

public class Q03 {

	public static void findOccurence(int[] array) {

		Scanner input = new Scanner(System.in);
		int number;
		do {
			number = input.nextInt();

			if (number >= 1 && number <= 100)
				array[number]++;
		} while (number != 0);

	}

	public static void main(String[] args) {
		int[] numbers = new int[101];

		System.out.print("Enter the integers between 1 and 100: ");
		
		findOccurence(numbers);
		
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1)
				System.out.println(i + " occurs " + numbers[i] + " time");
			else if (numbers[i] > 1)
				System.out.println(i + " occurs " + numbers[i] + " times");

		}
		
	}
}
