package chapter05;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");

		int numberOfStudents = input.nextInt();
		
		int maxScore = -1;
		String maxName = "";
		
		int maxSecondScore = -1;
		String maxSecondName = "";
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student name and score: ");
			String name = input.next();
			int score = input.nextInt();

			if (score > maxScore) {
				maxSecondScore = maxScore;
				maxSecondName = maxName;
				
				maxScore = score;
				maxName = name;
			} else if (score > maxSecondScore) {
				maxSecondScore = score;
				maxSecondName = name;
			}
		}
		
		System.out.println("Best student " + maxName + " with max score " + maxScore);
	}

}
