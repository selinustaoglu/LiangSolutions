package Chapter05;

import java.util.Scanner;

public class Q38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal interger:");
		int decimal = input.nextInt();
		
		String octal = "";
		
		for(int i = decimal; i > 0; i /= 8) {
			
			octal = (i % 8) + octal;
		}
		
		System.out.println(octal);
	}

}
