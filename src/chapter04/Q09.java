package chapter04;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		System.out.println("The ASCII code for character " + ch + " is " + (int)ch);
	}

}
