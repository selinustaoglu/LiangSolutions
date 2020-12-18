package chapter03;

import java.util.Scanner;

public class Q08 {
// yapamıyorum
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}	
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
	}

}

// 2 + 1 = 3
// 3 + 2 + 1 = 6
// 4 + 3 + 2 + 1 = 10