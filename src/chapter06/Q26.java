package chapter06;

public class Q26 {
	public static void main(String[] args) {
		int count = 0;
		final int NUMBER_PER_LINE = 10;
		
		int number = 2;
		while (true) {
			if(Q10.isPrime(number) && Q03.isPalindrome(number)) {
				System.out.printf("%6d", number);
				count++;

			 	if(count == 100)
					break;
			 	
				if(count % NUMBER_PER_LINE == 0)
					System.out.println();
			}
			number++;
		}

	}	

}
