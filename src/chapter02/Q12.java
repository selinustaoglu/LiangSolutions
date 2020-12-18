package chapter02;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		double runwayLength = (speed * speed) / (acceleration * 2);
		
		System.out.printf("The minimum runway length for this airplane is %.3f", runwayLength);

	}

}
