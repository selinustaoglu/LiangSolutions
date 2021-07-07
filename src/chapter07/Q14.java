package chapter07;

public class Q14 {

	public static void main(String[] args) {

		System.out.print("Enter 10 numbers to get their gcd: ");
		int[] numbers = Chapter7Util.scanIntArray(10);

		System.out.println("The GCD is " + gcd(numbers));

	}

	public static int gcd(int... numbers) {
		int gcd = 1;
		int min = Chapter7Util.min(numbers);
		int length = numbers.length - 1;

		int count = 0;
		for (int i = 2; i <= min; i++) {
			for (int j = 0; j <= length; j++) {
				if (numbers[j] % i == 0) {
					count++;
					if (count == length)
						gcd = i;
				} else {
					count = 0;
				}
			}
		}

		return gcd;
	}

}