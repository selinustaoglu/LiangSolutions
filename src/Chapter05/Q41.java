package Chapter05;

import java.util.Scanner;

public class Q41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		int max = -1;

		System.out.print("Enter numbers: ");
		int number = input.nextInt();

		while (number > 0) {
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max) {
				count++;
			}
			
			number = input.nextInt();
		}

		System.out.println("The largest number is: " + max);
		System.out.println("The number of occurences of the largest number: " + count);
	}

}
