package chapter06;

public class Q03 {

	public static int reverse(int number) {
		String word = String.valueOf(number);
		String reversed = "";
		reversed += word.substring(word.length() - 1);

		for (int i = word.length() - 1; i > 0; i--) {

			reversed += word.substring(i - 1, i);
		}

		number = Integer.parseInt(reversed);
		return number;
	}

	public static boolean isPalindrome(int number) {

		String original = String.valueOf(number);
		String reversed = String.valueOf(reverse(number));

		return original.equals(reversed);
	}

	public static void main(String[] args) {
		boolean result = isPalindrome(155);
		System.out.println(result);
	}
}
