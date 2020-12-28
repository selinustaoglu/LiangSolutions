package chapter05;

public class Q26 {

	public static void main(String[] args) {

		double e = 0;
		double value = 10000.0;

		for (double i = 1; i <= value; i++) {
			double denominator = i;
			for (double k = i - 1; k >= 1; k--) {
				denominator = denominator * k;
			}
			e += 1 / denominator;
		}

		System.out.println("The e value for i = 10000: " + e);

		e = 0;
		value = 20000;
		for (double i = 1; i <= value; i++) {
			double denominator = i;
			for (double k = i - 1; k >= 1; k--) {
				denominator = denominator * k;
			}
			e += 1 / denominator;
		}

		System.out.println("The e value for i = 20000: " + e);

		e = 0;
		value = 100000;
		for (double i = 1; i <= value; i++) {
			double denominator = i;
			for (double k = i - 1; k >= 1; k--) {
				denominator = denominator * k;
			}
			e += 1 / denominator;
		}
		//uzun suruyor
		System.out.println("The e value for i = 100000: " + e);

	}

}
