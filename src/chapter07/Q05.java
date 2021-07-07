package chapter07;

import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		int [] numbers = new int[10];
		int number;
		int count = 0;
		boolean exists= false;
		
		for (int i = 0; i < numbers.length; i++) {
			number = input.nextInt();
			
			exists= false;
			for (int j = 0; j < numbers.length; j++) {
				if(number == numbers[j]) {
					exists = true;
					break;
				}
			}
			if(!exists) {
				numbers[count] = number;
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
