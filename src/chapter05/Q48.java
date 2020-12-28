package chapter05;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = input.nextLine();
		
		for (int i = 0; i < word.length() - 1; i++) {
			
			if(i % 2 == 0)
				System.out.print(word.charAt(i));
		}
	}

}
