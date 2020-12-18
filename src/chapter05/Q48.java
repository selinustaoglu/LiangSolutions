package chapter05;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = input.next();
		
		for (int i = 1; i <= word.length(); i++) {
			
			if(i % 2 != 0)
				System.out.print(word.substring(i-1, i));
		}
	}

}
