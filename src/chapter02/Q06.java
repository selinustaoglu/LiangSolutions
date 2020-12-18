package chapter02;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int d3 = number % 10;
		int d2 = number / 10 % 10;
		int d1 = number / 100 % 10;
		
		System.out.println("The sum of the digits is " + (d1 + d2 + d3));
	}

}
