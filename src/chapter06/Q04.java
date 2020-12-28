package chapter06;

public class Q04 {
	
	public static void displayRiverse(int number) {
		String word = String.valueOf(number);
		String reversed = "";
		reversed += word.substring(word.length() - 1);

		for (int i = word.length() - 1; i > 0; i--) {

			reversed += word.substring(i - 1, i);
		}

		number = Integer.parseInt(reversed);
		System.out.println(number);
	}

	public static void main(String[] args) {
		displayRiverse(12345678);
	}

}
