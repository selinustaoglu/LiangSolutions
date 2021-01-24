package chapter06;

public class Q29 {
	
	public static boolean isPrime(int number) {
		boolean isPrime = false;
		
		for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		        isPrime = true;
		      }
		    }
		return !isPrime;
	}
	
	public static boolean isTwinprime(int num) {
		return isPrime(num) && isPrime(num + 2);
	}

	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			if (isTwinprime(i))
				System.out.println("(" + i + ", " + (i + 2) + ")");
		}

	}

}
