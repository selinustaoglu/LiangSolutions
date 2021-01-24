package chapter06;

public class Q26 {
	//satirlarin arasinda buyuk araliklar var
	
	public static boolean isPalindromicPrime(int number) {
		boolean isPrime = false;
		boolean isPalindrome = false;
		int reversed = 0;
		int num = number;
		
		for (int i = 2; i <= number / 2; ++i) {
		      if (number % i == 0) {
		        isPrime = true;
		      }
		    }
		
		while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
		
		if(num == reversed) {
			isPalindrome = true;
		}

		return isPalindrome && !isPrime;
	}

	public static void main(String[] args) {
		int count = 0;
		final int NUMBER_PER_LINE = 10;
		
		for (int i = 0; i < 1000000; i++) {
			if(isPalindromicPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		
			if(count % NUMBER_PER_LINE == 0)
				System.out.println();
			
		 	if(count == 100)
				break;
		
			
		}

	}	

}
