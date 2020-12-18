package chapter05;

public class Q25 {

	public static void main(String[] args) {
		double sum = 0;
		double value = 10000;
		
		for(double i = 1; i <= (2 * value - 1); i +=2 ) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		sum = 4 * sum;
		
		System.out.printf("when i = 10000 pi is %.5f\n",sum);
		
		sum = 0;
		value = 20000;
		
		for(double i = 1; i <= (2 * value - 1); i +=2 ) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		sum = 4 * sum;
		
		System.out.printf("when i = 20000 pi is %.5f\n",sum);
		
		sum = 0;
		value = 100000;
		
		for(double i = 1; i <= (2 * value - 1); i +=2 ) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i;
		}
		sum = 4 * sum;
		
		System.out.printf("when i = 100000 pi is %.5f",sum);
		
	}

}
