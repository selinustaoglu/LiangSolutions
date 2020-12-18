package chapter05;

public class Q23 {

	public static void main(String[] args) {
		double n = 50000;
		double rightToLeft = 0;
		double leftToRight = 0;
		
		for (double i = n; i > 0; i--) {
			rightToLeft += 1 / i;
		}
		for (double j = 1; j <= 50000; j++) {
			leftToRight += 1 / j;
		}
		
		System.out.printf("%.15f\n",leftToRight);
		System.out.printf("%.15f",rightToLeft);
	}

}
