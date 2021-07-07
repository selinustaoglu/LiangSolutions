package chapter07;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of values: ");
		int length = input.nextInt();
		
		System.out.println("Enter the values:");
		int [] numbers = Chapter7Util.scanIntArray(length);
		
		final String msg = consecutiveFours(numbers) 
				  ? " has " 
				  : " has no ";
		
		System.out.println("The list" + msg + "consecutive fours.");
	}
	
	public static boolean consecutiveFours(int [] array) {
		
		for (int i = 0; i < array.length-4; i++) {
			if(array[i] == array[i+1] &&  array[i+2] == array[i+3] && array[i] == array[i+3]) {
				return true;
			}	
		}
		return false;
	}

}
