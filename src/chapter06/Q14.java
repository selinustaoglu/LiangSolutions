package chapter06;

public class Q14 {
	public static double approximatePI(double n) {
		double pi = 0; // Set pi to 0
		for (double i = 1; i <= n; i++) {
			pi += (Math.pow(-1, i + 1)) / (2 * i - 1);
		}
		pi *= 4;
		return pi;
	}

	public static void main(String[] args) {

		System.out.println("i             pi\n" + "----------------");

		for (double i = 1; i < 902; i += 100) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%-6.4f\n", approximatePI(i));
		}
	}

}
