package chapter06;

public class Q27 {
//satirlarin arasinda araliklar var
	public static boolean emirp(int number) {
		int reversed = 0;
		int num = number;
		boolean isPrime = false;
		boolean reversedPrime = false;

		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				isPrime = true;
			}
		}

		if (!isPrime) {
			while (number != 0) {
				int digit = number % 10;
				reversed = reversed * 10 + digit;
				number /= 10;
			}
		}
		for (int i = 2; i <= reversed / 2; ++i) {
			if (reversed % i == 0) {
				reversedPrime = true;
			}
		}

		return !isPrime && !reversedPrime;
	}

	public static void main(String[] args) {
		int count = 0;
		int i = 0;
		
		while(count != 100) {
			
			if(emirp(i)) {
				System.out.print(i + " ");
				count++;
				
			}
			if(i%10 == 0) {
				System.out.println();
			}
			i++;
		}
	}

}
