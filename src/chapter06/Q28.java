package chapter06;

public class Q28 {

	public static int mersennePrime(int number) {
		return (int) Math.pow(2, number) - 1;
	}

	public static void main(String[] args) {
		System.out.println("\np           2^p-1");
		System.out.println("--------------------");

		for (int i = 2; i <= 31; i++) {
			if (Chapter06Util.isPrime(i)) {
				System.out.printf("%-13d", i);
				System.out.println(mersennePrime(i));
			}
		}
	}
}
