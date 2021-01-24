package chapter06;

import java.util.Scanner;

public class Q07 {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

		return futureInvestmentValue;
	}

	public static void main(String[] args) {
		// System.out.printf("%.3f", futureInvestmentValue(10000, 0.05 / 12, 5));

		// Test Program
		Scanner input = new Scanner(System.in);
		final int YEARS = 30;

		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.println("Years     Future Value");
		for (int years = 1; years <= YEARS; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", futureInvestmentValue(amount, monthlyInterestRate, years));
		}
	}
}
