package chapter07;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list1:");
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		
		System.out.println("Enter list2:");
		int length2 = input.nextInt();
		int[] list2 = new int[length1];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int numbers[] = new int[length1 + length2];
		numbers = merge(list1, list2);

	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		
		int[] numbers = new int[list1.length + list2.length];

		while(index1 < list1.length && index2 < list2.length) {
			if (list1[index1] < list2[index2]) {
				numbers[index++] = list1[index1++];
			} else {
				numbers[index++] = list2[index2++];
			}
		}
		
		while(index1 < list1.length) {
			numbers[index++] = list1[index1++];
		}
		
		while(index2 < list2.length ) {
			numbers[index++] = list1[index2++];
		}
		
		return numbers;
	}

	public static int[] merge2(int[] list1, int[] list2) {
		Chapter7Util.selectionSort(list1);
		Chapter7Util.selectionSort(list2);
		int count;
		int index1 = 0;
		int index2 = 0;
		int index = 0;

		int[] numbers = new int[list1.length + list2.length];

		if (list1.length >= list2.length)
			count = list2.length;
		else
			count = list1.length;

		while (count != 0) {
			if (list1[index1] > list2[index2]) {
				numbers[index++] = list2[index2++];
				
				if (count == list2.length)
					count--;
			} else if (list1[index1] < list2[index2]) {
				numbers[index++] = list1[index1++];
				if (count == list1.length)
					count--;
			} else {
				numbers[index++] = list1[index1++];
				numbers[index++] = list2[index2++];
				count--;
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
		return numbers;
	}

}
