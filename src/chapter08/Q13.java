package chapter08;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int col = input.nextInt();

		double[][] matrix = Chapter8Util.getMatrix(row, col);

		int[] coords = locateLargest(matrix);
		System.out.print("The location of the largest element is at (");
		
		for (int i = 0; i < coords.length; i++) {
			String msg = i == 0? "," : ")";
			System.out.print(coords[i] + msg);
		}
		
	}

	public static int[] locateLargest(double[][] a) {
		int[] coordinates = new int[2];
		double max = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length - 1; col++) {
				if (a[row][col + 1] > max) {
					max = a[row][col + 1];
					coordinates[0] = row;
					coordinates[1] = col + 1;
				}
			}
		}

		return coordinates;

	}
}
