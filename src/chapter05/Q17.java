package chapter05;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		for(int i = 0; i < lines; i++) {
			for (int j = lines - i; j >= 1; j--)
				System.out.print("  ");
			
			for (int s = i + 1; s > 0  ; s--) 
				System.out.print(s + " ");
				
			for (int n = 2; n <= i + 1; n++)
				System.out.print(n + " ");
			
			System.out.println();
			
		}
			
	}

}
