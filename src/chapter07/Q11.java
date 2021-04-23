package chapter07;

public class Q11 {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");

		double[] numbers = Chapter7Util.scanDoubleArray(10);
		
		System.out.printf("The mean is %.2f\n",mean(numbers));
		System.out.printf("The standard deviation is %.5f\n",deviation(numbers));
		
	}

	public static double deviation(double[] x) {
		
		double mean = mean(x);
		double stdSum = 0;
		
		for (int i = 0; i < x.length; i++) {
			
			stdSum += Math.pow((x[i] - mean), 2);
		}
		
		return Math.sqrt((stdSum)/9);
	}

	public static double mean(double[] x) {
		double sum = 0;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / 10;
	}
}
