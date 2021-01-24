package chapter06;

public class Q10 {
	
	public static boolean isPrime(int number) {
	    
		for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	}

	public static void main(String[] args) {
		int primeCount = 0;;
		int number = 0;
		
		while(number < 10000) {
			if (isPrime(number) == true) {
				primeCount++;
			}
		 number++;
		}
		System.out.println(primeCount);
	}

}
