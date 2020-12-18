package chapter03;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		int weight1 = input.nextInt();
		double price1 = input.nextDouble();
		double weightPerPrice1 = weight1 / price1;
		
		System.out.print("Enter weight and price for package 2: ");
		int weight2 = input.nextInt();
		double price2 = input.nextDouble();
		double weightPerPrice2 = weight2 / price2;
		
		if (weightPerPrice1 > weightPerPrice2)
			System.out.println("Package 1 has a better price.");
		else if (weightPerPrice1 == weightPerPrice2)
			System.out.println("Two packages have the same price.");
		else
			System.out.println("Package 2 has a better price.");
	}

}
