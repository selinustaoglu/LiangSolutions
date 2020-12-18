package chapter02;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double MONTHLY_INTEREST_RATE = 0.00417;
		
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		
		double total =  savingAmount * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		
		System.out.printf("After the sixth month, the account value is $%.2f", total);
		
	}

}
