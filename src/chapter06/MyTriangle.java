package chapter06;

import java.util.Scanner;
//program dorgu mu? 1 2 3 isValid e giriyor ama alani 0 cikti
public class MyTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		boolean isValid = false;

		if (side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
			isValid = true;
			return isValid;
		} else
			return isValid;

	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Write three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if(isValid(side1, side2, side3)) {
			double area = area(side1, side2, side3);
			System.out.println(area);
		}else
			System.out.println("invalid input");
		

	}

}
