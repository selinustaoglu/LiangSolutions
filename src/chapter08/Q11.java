package chapter08;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		System.out.println("Enter a number between 0 and 511: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int[] number = convertBinary(num);
		
		printGrid(number);
	}
	
	public static void printGrid(int[] number) {
		for (int i = 1; i <= number.length; i++) {
			String msg = number[i-1] == 1 ? "T" : "H";
			System.out.print(msg + " ");
			
			if(i % 3 == 0)
				System.out.println();
			}
		}
	

	public static int[] convertBinary(int number) {
		int i = 0, temp[] = new int[9];
		int binary[];
		while (number > 0) {
			temp[i++] = number % 2;
			number /= 2;
		}
		return reverse(temp);
	}
	
	public static int[] reverse(final int[] list) {

		int temp;
		
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		
		return list;
	}

}
