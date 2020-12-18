package chapter06;

public class Q02 {
	
	public static int sumDigits(long n) {
		int sum = 0;
		long number = n;
		
		while(number != 0) {
			sum += number % 10;
			number = (int) number / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumDigits(12345678));
	}

}
