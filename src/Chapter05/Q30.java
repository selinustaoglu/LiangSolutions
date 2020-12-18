package Chapter05;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of money: ");
		int amount = input.nextInt();

		System.out.print("Enter the interest rate: ");
		double rate = input.nextDouble() / 100;

		System.out.print("Enter the number of months: ");
		int month = input.nextInt();

		rate = rate / 12;

		double value = 0;
		for (int i = 0; i < month; i++) {

			value = (amount + value) * (1 + rate);
		}

		System.out.printf("%.3f", value);

	}
}