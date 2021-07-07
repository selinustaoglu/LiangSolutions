package chapter07;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String word = input.next();

		System.out.println(sort(word));
	}

	public static String sort(String s) {

		int length = s.length();
		char[] string = new char[length];

		for (int i = 0; i < s.length(); i++) {
			string[i] = s.charAt(i);
		}

		for (int i = 0; i < length - 1; i++)
			for (int j = 0; j < length - i - 1; j++)
				if (string[j] > string[j + 1]) {

					char temp = string[j];
					string[j] = string[j + 1];
					string[j + 1] = temp;
				}

		String word = "";

		for (int i = 0; i < string.length; i++) {
			word += string[i];
		}

		return word;
	}

}
