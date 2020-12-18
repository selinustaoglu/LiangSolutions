package Chapter05;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mean;				
		double deviation;
		double number;
		mean = deviation = 0;	
		
		System.out.print("Enter ten numbers: ");

		for (int i = 1; i <= 10; i++) {
			number = input.nextDouble();
			mean += number;
			deviation += Math.pow(number, 2); 
		}
		deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
		mean = mean / 10;

		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.5f", deviation);
	}

}
