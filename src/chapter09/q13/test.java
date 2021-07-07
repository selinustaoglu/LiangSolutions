package chapter09.q13;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// Create a Scanner object
				Scanner input = new Scanner(System.in);

				System.out.print("Enter the number of rows and columns in the array: ");
				int rows = input.nextInt();
				int columns = input.nextInt();

				double[][] array = new double[rows][columns]; 
				System.out.println("Enter the array: ");
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						array[i][j] = input.nextDouble();
					}
				}

				Location max = Location.locateLargest(array);

				System.out.println("The location of the largest element is " +
					max.maxValue + " at (" + max.row + ", " + max.column + ")");

	}

}
