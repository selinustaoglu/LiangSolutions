package chapter06;

public class Q13 {
	public static double fractionSummation(double i) {
		double sum = 0;
		
		for(double a = 1; a <= i; a++) {
			sum += a / (a + 1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("  i       m(i)\n" + "------------------");
		
		for (double i = 1; i < 21; i++) {
			System.out.printf("%3.0f",i);
			System.out.printf("%15.4f\n", fractionSummation(i));
		}
	}

}
