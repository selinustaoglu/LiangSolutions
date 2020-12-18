package chapter05;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		long startTime = System.currentTimeMillis();
		String output = ""; // output string is initially empty
		Scanner input = new Scanner(System.in);

		for (int count = 0; count < NUMBER_OF_QUESTIONS; count++) {
			// 1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 15 + 1);
			int number2 = (int) (Math.random() * 15 + 1);
			
			// 3. Prompt the student to answer "What is number1 � number2?"
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else
				System.out.println(
						"Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));

			output += "\n" + number1 + "+" + number2 + "=" + answer
					+ ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println(
				"\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}

}
