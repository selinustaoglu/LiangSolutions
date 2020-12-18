package chapter03;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperature = input.nextDouble();
		
		if (temperature < -58 || temperature > 41) {
			System.out.println("Temperature is invalid");
			return;
		}

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double speed = input.nextDouble();
		
		if (speed < 2) {
			System.out.println("Speed is invalid");
			return;
		}
		
		double windchill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
				+ 0.4275 * temperature * Math.pow(speed, 0.16);

		System.out.printf("The wind chill index is %.5f", windchill);
		
	}

}
