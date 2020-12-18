package chapter02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsiusValue = input.nextDouble();
		
		double fahrenheitValue =  (9.0 / 5) * celsiusValue + 32;
		
		System.out.println(celsiusValue + " Celsius is " + fahrenheitValue + " Fahrenheit");
	}

}
