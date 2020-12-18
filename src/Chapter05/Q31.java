package Chapter05;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of money: ");
		double amount = input.nextInt();

		System.out.print("Enter the annual percentage yield: ");
		double rate = input.nextDouble();

		System.out.print("Enter the number of months: ");
		int month = input.nextInt();

		System.out.println("Month       CD Value");

		for (int i = 1; i <= month; i++) {
			amount = amount + (amount * rate / 1200);
			System.out.printf("%3d%18.2f\n", i, amount);
		}

	}
}
