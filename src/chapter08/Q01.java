package chapter08;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		double[][] matrix = Chapter8Util.getMatrix(3, 4);

		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {

		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
}
