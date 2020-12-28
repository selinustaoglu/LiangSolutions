package chapter06;

public class Q05 {

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double a = num1;
		double b = num2;
		double c = num3;
		double temp;

		if (b < a) {
			temp = b;
			b = a;
			a = temp;
		}

		if (c < b) {
			temp = c;
			c = b;
			b = temp;
		}

		if (b < a) {
			temp = b;
			b = a;
			a = temp;
		}
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		displaySortedNumbers(0.5,0.3,0.4);
	}

}
