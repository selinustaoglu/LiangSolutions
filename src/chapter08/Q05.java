package chapter08;

public class Q05 {

	public static void main(String[] args) {
		double[][] a = Chapter8Util.getMatrix(3, 3);

		double[][] b = Chapter8Util.getMatrix(3, 3);

		double[][] c = addMatrix(a, b);

		print(a, b, c, "+");

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] resultMatrix = new double[a.length][a[0].length];
		
		if (a.length == b.length && a[0].length == b[0].length) {
			for (int i = 0; i < resultMatrix.length; i++) 
				for (int j = 0; j < resultMatrix.length; j++) 
					resultMatrix[i][j] = a[i][j] + b[i][j];
		}

		return resultMatrix;
	}

	public static void print(double[][] a, double[][] b, double[][] c, String op) {
		System.out.println("The matrices are added as follows: ");

		for (int r = 0; r < c.length; r++) {
			boolean isSign = (r == c.length / 2);

			rowPrint(a, r);

			System.out.print(isSign ? ("  " + op + "  ") : "     ");

			rowPrint(b, r);

			System.out.print(isSign ? "  =  " : "     ");

			rowPrint(c, r);

			System.out.println();
		}
	}

	public static void rowPrint(double[][] a, int r) {
		for (int c = 0; c < a.length; c++) {
			System.out.print(a[r][c] + " ");
		}
	}

}
