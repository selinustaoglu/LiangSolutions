package chapter07;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter random integers:");
		int length = input.nextInt();
		
		int [] numbers = new int[length];
	
		for (int i = 0; i < numbers.length; i++) { //chapter7util deki methodla yapinca olmadi?
			numbers[i]= input.nextInt();
		}
		
		final String msg = isSorted(numbers)
				  ? "The array is sorted" 
				  : "The array is not sorted";
		
		System.out.println(msg);
	}
	
	public static boolean isSorted(int[] array) {
		
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}

}
