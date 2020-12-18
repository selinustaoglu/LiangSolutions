package chapter04;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		for (int i = 18; i <= 360; i += 72) {
			printPoint(radius, i);
		}
	}

	private static void printPoint(double radius, double a) {
		double x = radius * Math.cos(Math.toRadians(a));
		double y = radius * Math.sin(Math.toRadians(a));
		System.out.printf("(%.4f, %.4f)\n", x, y);
	}
}
