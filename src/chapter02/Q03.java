package chapter02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		final double METERS_PER_FEET = 0.305;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feetValue = input.nextDouble();
		
		double meterValue = feetValue * METERS_PER_FEET;
		
		System.out.println(feetValue + " feet is " + meterValue + " meters.");
	}

}
