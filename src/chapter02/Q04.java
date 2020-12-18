package chapter02;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		final double KILOGRAM_PER_POUND = 0.454;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");
		double poundValue = input.nextDouble();

		double kilogramValue = poundValue * KILOGRAM_PER_POUND;

		System.out.println(poundValue + " pounds is " + kilogramValue + " kilograms");

	}

}
