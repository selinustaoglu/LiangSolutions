package chapter05;

import java.util.Scanner;

public class Q50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String word = input.nextLine();

		int count = 0;		
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				count++;
		}

		System.out.println("Tne number of uppercase letters is " + count);
	}

}
