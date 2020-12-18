package chapter04;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		final double RADIUS_OF_EARTH = 6371.01;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		double d = RADIUS_OF_EARTH * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.print("The distance between the two points is " + d + " km");
		
		
	}
	

}
