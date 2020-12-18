package chapter05;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");

		int numberOfStudents = input.nextInt();
		
		int maxScore = -1;
		String maxName = "";
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student name and score: ");
			String name = input.next();
			int score = input.nextInt();

			if (score > maxScore) {
				maxScore = score;
				maxName = name;
			}
		}
		
		System.out.println("Best student " + maxName + " with max score " + maxScore);
	}
}
