package chapter05;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int minimum = 0;
		
		if(number1 > number2)
			minimum = number2;
		else
			minimum = number1;
		
		while ((number1 % minimum != 0) || (number2 % minimum != 0))
			minimum--;
	
		System.out.println("The greatest common divisor is " + minimum);		
	}

}
