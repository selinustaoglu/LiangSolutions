package chapter07;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		System.out.println("Enter list1: ");
		
		Scanner input = new Scanner(System.in);
		
		int length = input.nextInt();
		
		int [] list1 = new int[length];
	
		for (int i = 0; i < list1.length; i++) { 
			list1[i]= input.nextInt();
		}
		
		System.out.println("Enter list2: ");
		
		length = input.nextInt();
		
		int [] list2 = new int[length];
		
		for (int i = 0; i < list2.length; i++) { 
			list2[i]= input.nextInt();
		}
		
		if(equals(list1,list2))
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");

	}

	public static boolean equals(int[] list1, int[] list2) {
		
		for (int i = 0; i < list2.length; i++) {
			if(list1[i] != list2[i])
				return false;
		}
		
		return true;
	}
}
