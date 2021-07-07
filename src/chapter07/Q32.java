package chapter07;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int length = input.nextInt();

		System.out.println("Enter the values:");
		int[] list = Chapter7Util.scanIntArray(length);

		partition(list);

		Chapter7Util.arrayPrint(list);
	}

	public static int partition(int[] list) {

		int low = 0;
		int high = list.length - 1;
		int pivot = list[low];

		while (low <= high) {

			while (list[low] <= pivot) {
				low++;
			}
			while (list[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}

		int index = 1;

		while (list[index] <= list[0]) {
			index++;
		}

		int temp = list[index - 1];
		list[index - 1] = list[0];
		list[0] = temp;

		return index;
	}

}
