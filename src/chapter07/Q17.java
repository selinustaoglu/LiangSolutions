package chapter07;

import java.util.Scanner;
import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.println("Enter the names of students: ");
		String[] studentNames = Chapter7Util.scanStringArray(numberOfStudents);

		System.out.println("Enter the grades of each student in order with the names: ");
		double[] grades = Chapter7Util.scanDoubleArray(numberOfStudents);

		for (int i = 0; i < grades.length; i++) {
			for (int j = i + 1; j < grades.length; j++) {
				if (grades[i] > grades[j]) {
					double temp = grades[i];
					grades[i] = grades[j];
					grades[j] = temp;

					String tempString = studentNames[i];
					studentNames[i] = studentNames[j];
					studentNames[j] = tempString;
				}
			}
		}

		System.out.println(Arrays.toString(grades));
		System.out.println(Arrays.toString(studentNames));

	}
}