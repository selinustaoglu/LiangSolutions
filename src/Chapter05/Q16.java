package chapter05;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int factor = 2;

		while (factor != 0) {
			if (number % factor == 0) {
				System.out.print(factor + ", ");
				number /= factor;

			} else if (number % factor != 0)
				factor++;
		}
	}
}
