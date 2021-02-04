package chapter07;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];

		System.out.print("Enter ten integers with space between: ");
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int i = 9; i < numbers.length && i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}

}
