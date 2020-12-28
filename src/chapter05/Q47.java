package chapter05;

import java.util.Scanner;

public class Q47 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = input.next();
		
		if (isbn.length() != 12) {
			System.out.println(isbn + " invalid input");
		}
		
		for (int i = 0; i < isbn.length(); i++) {
			
			if(i % 2 == 0) {
				sum += 3 * Integer.parseInt(isbn.substring(i, i + 1));
			}else {
				sum += Integer.parseInt(isbn.substring(i, i + 1));
			}	
		}
		
		sum = 10 - (sum % 10);
		
		if(sum == 10) {
			System.out.println(isbn + "0");
		}else
			System.out.println(isbn + sum);
	}

}
