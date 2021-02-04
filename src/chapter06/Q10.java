package chapter06;

public class Q10 {
	public static void main(String[] args) {
		int primeCount = 0;
		int number = 0;

		while (number < 10000) {
			if (Chapter06Util.isPrime(number)) {
				primeCount++;
			}
			number++;
		}
		System.out.println("the number of prime numbers less than 10000 is " + primeCount);
	}

}
