package chapter08;

import java.util.Scanner;

public class Chapter8Util {

	public static double[][] getMatrix(int row, int col) {

		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[row][col];

		// Prompt the user to enter a 3-by-4 matrix
		System.out.println("Enter a matrix:");
		for (int rows = 0; rows < matrix.length; rows++)
			for (int cols = 0; cols < matrix[0].length; cols++)
				matrix[rows][cols] = input.nextDouble();
		return matrix;
	}
	
	public static void printMatrix(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
