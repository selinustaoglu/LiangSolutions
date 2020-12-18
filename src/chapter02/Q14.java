package chapter02;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double KG_PER_POUND = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble() * KG_PER_POUND;
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble() * METER_PER_INCH;
		
		double bmi = weight / (height * height);
		
		System.out.printf("BMI is %.4f", bmi);
	}

}
