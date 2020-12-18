package chapter03;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.print("Is 10 divisible by 5 and 6? ");
		
		boolean is1 =((number % 5 == 0) && (number % 6 == 0));
		System.out.println(is1);
		
		System.out.print("Is 10 divisible by 5 or 6? ");
		
		boolean is2 =((number % 5 == 0) || (number % 6 == 0));
		System.out.println(is2);

		System.out.print("Is 10 divisible by 5 or 6, but not both? ");
		
		boolean is3 =((number % 5 == 0) ^ (number % 6 == 0));
		System.out.println(is3);
	}

}
 