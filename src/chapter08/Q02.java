package chapter08;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		double[][] matrix = getMatrix();
		
		System.out.println("Sum of the elements in the major diagonal is " + diagonalSum(matrix));

	}
	
	public static double diagonalSum(double[][] m) {
		double diagonalSum = 0;
		for (int i = 0; i < m.length; i++) {
			diagonalSum += m[i][i];
		}
		
		return diagonalSum;
	}
	
	public static double[][] getMatrix() {

		Scanner input = new Scanner(System.in);
		final int ROWS = 4;
		final int COLUMNS = 4;
		double[][] m = new double[ROWS][COLUMNS];

		// Prompt the user to enter a 3-by-4 matrix
		System.out.println("Enter a " + ROWS + "-by-" + COLUMNS + " matrix row by row:");
		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[row].length; col++)
				m[row][col] = input.nextDouble();
		return m;
	}

}
