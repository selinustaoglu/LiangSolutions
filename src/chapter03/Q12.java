package chapter03;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		int digit1 = number / 100 % 10;
		int digit3 = number % 10;
		
		if (digit3 == digit1)
			System.out.println(number + " is a palindrome");
		else 
			System.out.println(number + " is not a palindrome");
		
	}

}
