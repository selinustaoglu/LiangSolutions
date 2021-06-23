package chapter08;

public class Q06 {

	public static void main(String[] args) {
		double[][] a = Chapter8Util.getMatrix(3, 3);
		
		double[][] b = Chapter8Util.getMatrix(3, 3);
		
		double[][] c = multiplyMatrix(a, b);
		
		Q05.print(a, b, c, "*");
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		double[][] resultMatrix = new double[a.length][b[0].length];
		
		if(a[0].length == b.length) {
			for (int i = 0; i < resultMatrix.length; i++) {
				for (int j = 0; j < resultMatrix[i].length; j++) {
					// cij = ai1 * b1j + ai2 * b2j + ai3 * b3j
					resultMatrix[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
				}
			}
		}
		
		return resultMatrix;
	}
	
}
