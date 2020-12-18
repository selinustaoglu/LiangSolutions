package chapter03;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of your package: ");
		double weight = input.nextDouble();
		
		if (weight <= 0) {
			System.out.println("Invalid input");
			return;
		}
		
		if(weight <= 1)
			System.out.println("The cost of shipping is $3.5");
		else if (weight <= 3)
			System.out.println("The cost of shipping is $5.5");
		else if (weight <= 10)
			System.out.println("The cost of shipping is $8.5");
		else if (weight <= 20)
			System.out.println("The cost of shipping is $10.5");
		else 
			System.out.println("The package cannot be shipped");



	}

}
