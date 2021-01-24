package chapter06;

import java.util.Scanner;

public class Q36 {
	
	public static double area(int n, double side) {
		double area = (n * side * side) / (4 * Math.tan(Math.PI / 5));
		return area;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.println(area(n, side));

	}



}
