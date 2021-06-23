package chapter08;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the square matrix: ");
		int row = input.nextInt();
		int col = input.nextInt();

		double[][] matrix = Chapter8Util.getMatrix(row, col);
	}
	
	public static int[][] generateMatrix(int row, int col) {

		int[][] matrix = new int[row][col];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				matrix[i][j] = (int) Math.round(Math.random());
			}
		}
		return matrix;
	}
	
	public static void zerosOnRow(double[][] matrix) {
		
	}
	
	public static void onesOnRow(double[][] matrix) {
		
	}
	
	public static void zerosOnColumn(double[][] matrix) {
		
	}
	
	public static void onesOnColumn(double[][] matrix) {
		
	}
	
	public static void zerosOnDiagonal(double[][] matrix) {
		
	}
	public static void onesOnDiagonal(double[][] matrix) {
		
	}

}
