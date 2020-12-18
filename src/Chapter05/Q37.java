package Chapter05;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal interger:");
		int decimal = input.nextInt();
		
		String binary = "";
		
		for(int i = decimal; i > 0; i /= 2) {
			
			binary = (i % 2) + binary;
		}
		
		System.out.println(binary);
	}

}


