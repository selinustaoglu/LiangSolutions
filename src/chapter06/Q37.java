package chapter06;

public class Q37 {

	public static String format(int number, int width) {
		String numberString = Integer.toString(number);
		int length = numberString.length();
		String formattedNumber = " ";

		if (width <= length)
			return numberString;

		int zeroCount = width - length;

		for (int i = 1; i <= zeroCount; i++) {
			formattedNumber += "0";
		}

		formattedNumber += numberString;

		return formattedNumber;

	}

	public static void main(String[] args) {
		System.out.println(format(34, 6));
	}

}
