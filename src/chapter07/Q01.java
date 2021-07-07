package chapter07;

import java.util.Scanner;

public class Q01 {

	public static int getBestScore(int[] array) {
		int bestScore = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > bestScore)
				bestScore = array[i];
		}
		return bestScore;
	}

	public static void getScores(int[] array) {
		int bestScore = getBestScore(array);

		for (int i = 0; i < array.length; i++) {

			if (array[i] >= bestScore - 10)
				System.out.println("Student " + i + " score is " + array[i] + " and grade is A");
			else if (array[i] >= bestScore - 20)
				System.out.println("Student " + i + " score is " + array[i] + " and grade is B");
			else if (array[i] >= bestScore - 30)
				System.out.println("Student " + i + " score is " + array[i] + " and grade is C");
			else if (array[i] >= bestScore - 40)
				System.out.println("Student " + i + " score is " + array[i] + " and grade is D");
			else
				System.out.println("Grade is F");
			
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int length = input.nextInt();
		int[] scores = new int[length];

		System.out.print("Enter " + length + " scores: ");

		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		getScores(scores);
	}

}
