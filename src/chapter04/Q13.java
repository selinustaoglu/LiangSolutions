package chapter04;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String s = input.next();
		char ch = s.charAt(0);
		
		if (Character.isLetter(ch)) {
			switch (Character.toUpperCase(ch)) {
			case 'A': System.out.println(ch + " is a vowel");break;
			case 'E': System.out.println(ch + " is a vowel");break;
			case 'I': System.out.println(ch + " is a vowel");break;
			case 'O': System.out.println(ch + " is a vowel");break;
			case 'U': System.out.println(ch + " is a vowel");break;
			default:System.out.println(ch + " is a consonant");break;
			}
		}
		
		else 
			System.out.println(ch + " is an invalid character");
	}

}
