package chapter05;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double squareOfSum = 0;
		
		System.out.print("Enter ten numbers: ");

		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			sum += number;
			squareOfSum += Math.pow(number, 2); 
		}
		double mean = sum / 10;
		double deviation =  Math.sqrt((squareOfSum - (Math.pow(mean, 2) / 10)) / (10 - 1));
		
		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.5f", deviation);
	}

}
