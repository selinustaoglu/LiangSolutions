package chapter07;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of grades: ");
		int index = input.nextInt();
		int[] grades = new int[index + 1];
		
		System.out.print("Enter grades(max. 100 grades) : ");
		for (int i = 0; i < grades.length; i++) {
			grades[i] = input.nextInt();
		}
		
		computeStatistics(grades);
	}
	public static int computeAverage(int[] array) {
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			count++;
		}
		return sum / count;
	}
	
	public static void computeStatistics(int[] array) {
		int i = 0;
		int above = 0;
		int below = 0;
		int average = computeAverage(array);
		while (array[i] >= 0) {
			if(array[i] >= average)
				above++;
			else
				below++;
			i++;
		}
		System.out.println(above + " grades are equal to or above the average");
		System.out.print(below + " grades are below the average");
		
	}
}
