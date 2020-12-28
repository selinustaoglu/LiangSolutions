package chapter05;

import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.next();
		int length = word.length();
		
		for (int i = length - 1; i >= 0; i--) {
			
			System.out.print(word.charAt(i));
			
		}
	}

}
