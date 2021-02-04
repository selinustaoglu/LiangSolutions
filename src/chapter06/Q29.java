package chapter06;

public class Q29 {

	public static boolean isTwinprime(int num) {
		return Chapter06Util.isPrime(num) && Chapter06Util.isPrime(num + 2);
	}

	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			if (isTwinprime(i))
				System.out.println("(" + i + ", " + (i + 2) + ")");
		}
	}

}
