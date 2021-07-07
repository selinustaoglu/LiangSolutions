package chapter07;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");

		double [] numbers = Chapter7Util.scanDoubleArray(10);
		
		double average = average(numbers);
		
		System.out.println("The average of this array is : " + average);

	}

	public static int average(int[] array) {
		int count = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			count++;
		}
		return sum / count;
	}

	public static double average(double[] array) {
		double count = 0;
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			count++;
		}
		return sum / count;
	}
}
