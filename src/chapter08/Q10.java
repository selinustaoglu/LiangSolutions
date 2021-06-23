package chapter08;

public class Q10 {

	public static void main(String[] args) {
		int[][] matrix = generateMatrix();
		
		Chapter8Util.printMatrix(matrix);
		System.out.println("The largest row index: " + maxRow(matrix));
		System.out.println("The largest column index: " + maxColumn(matrix));
	}

	public static int maxRow(int[][] matrix) {
		int maxRowSum = 0;
		int maxRowIndex = 0;
		int nextRowSum = 0;

		for (int i = 0; i < matrix.length; i++) {
			maxRowSum += matrix[0][i];
		}

		for (int row = 1; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				nextRowSum += matrix[row][col];
			}

			if (nextRowSum > maxRowSum) {
				maxRowIndex = row;
				maxRowSum = nextRowSum;
				nextRowSum = 0;
			}
		}

		return maxRowIndex;
	}

	public static int maxColumn(int[][] matrix) {
		int maxColSum = 0;
		int maxColIndex = 0;
		int nextColSum = 0;

		for (int i = 0; i < matrix.length; i++) {
			maxColSum += matrix[0][i];
		}

		for (int col = 1; col < matrix.length; col++) {
			for (int row = 0; row < matrix.length; row++) {
				nextColSum += matrix[row][col];
			}

			if (nextColSum > maxColSum) {
				maxColIndex = col;
				maxColSum = nextColSum;
				nextColSum = 0;
			}
		}

		return maxColIndex;
	}

	public static int[][] generateMatrix() {

		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				matrix[i][j] = (int) Math.round(Math.random());
			}
		}
		return matrix;
	}

}
