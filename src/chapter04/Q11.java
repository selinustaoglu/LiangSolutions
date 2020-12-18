package chapter04;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int number = input.nextInt();
		
		if(0 <= number && number <= 9) 
			System.out.println("The hex value is " + number);
		else if (10 <= number && number <= 15)
			System.out.println("The hex value is " + (char) ('A' + number - 10));
		else
			System.out.println(number + " is an invalid input.");
		
	}

}
