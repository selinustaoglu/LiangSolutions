package chapter05;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double interestRate = 5;
		
		System.out.print("Loan Amount: ");
		int loanAmount = input.nextInt();
		
		System.out.print("Number of Years: ");
		int year = input.nextInt();
		
		System.out.println("Interest Rate      Monthly Payment     Total Payment");
		
		for (int i = 0; i < year; i++) {
			System.out.printf("%-5.3f", interestRate);
			System.out.print("%          ");
			System.out.print(loanAmount * (interestRate / 100));
		}
		
	}

}
