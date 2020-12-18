package chapter04;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String s = input.nextLine();
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());

	}

}
