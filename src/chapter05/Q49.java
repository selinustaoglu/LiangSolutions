package chapter05;

import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
		// bosluk olunca calismayi birakiyor
		Scanner input = new Scanner(System.in);
		int vowel = 0;
		int consonant = 0;

		System.out.print("Enter a word: ");
		String word = input.next();

		for (int i = 0; i < word.length(); i++) {
			char ch = Character.toUpperCase(word.charAt(i));
			if (!Character.isLetter(ch))
				continue;

			// if (ch in {a, b, c, })
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				vowel++;
			else
				consonant++;

		}

		System.out.println("The number of vowels is " + vowel);
		System.out.println("The number of consonants is " + consonant);
	}
}
