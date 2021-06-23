package chapter09.q10;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the coefficients of a quadratic equation: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		
		double discriminant = equation.getDiscriminant();
		
		if(discriminant > 0) {
			System.out.println("Root 1 is " + equation.getRoot1());
			System.out.println("Root 2 is " + equation.getRoot2());
		}else if(discriminant == 0) {
			System.out.println("The root is " + (-b/2*a));
		}else {
			System.out.println("The equation has no roots");
		}
	}

}
