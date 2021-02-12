package chapter06;

public class Q27 {
//satirlarin arasinda araliklar var
	public static boolean emirp(int number) {

		if (!Chapter06Util.isPrime(number))
			return false;

		int reversed = reverse(number);

		if (number == reversed)
			return false;

		if (!Chapter06Util.isPrime(reversed))
			return false;

		return true;
	}

	public static int reverse(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}

	public static void main(String[] args) {
		int count = 0;
		int i = 10;

		while (count != 100) {

			if (emirp(i)) {
				System.out.printf("%5d", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}

			i++;
		}
	}

}
