package chapter03;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int option = input.nextInt();
		
		switch (option) {
		case 0: System.out.println("Enter the dollar amount:  ");
				int amount = input.nextInt();
				System.out.print("$" + amount + " is " + (amount * exchangeRate) + " yuan");
			break;
		case 1: System.out.print("Enter the RMB amount:  ");
				amount = input.nextInt();
				System.out.print(amount + " yuan is $" + ((int)((amount * 100) / exchangeRate)) / 100.0);
			break;

		default: System.out.print("invalid input");
			break;
		}
	}

}
