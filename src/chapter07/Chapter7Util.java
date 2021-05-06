package chapter07;

import java.util.Scanner;

public class Chapter7Util {

	public static void arrayPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void arrayPrint(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static <E> void arrayPrint(E[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void integerArrayPrintWithoutZeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0)
				System.out.print(array[i] + " ");
		}
	}

	public static double[] scanDoubleArray(int index) {

		double[] array = new double[index];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		return array;
	}

	public static int[] scanIntArray(int index) {

		int[] array = new int[index];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}

	public static String[] scanStringArray(int index) {

		String[] array = new String[index];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.next();
		}
		return array;

	}
	
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static int min(int[] array) {
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
}
