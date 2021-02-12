package chapter05;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computerWins = 0;
		int youWin = 0;

		do {
			int computer = (int) (Math.random() * 3);

			System.out.print("scissor (0), rock (1), paper (2): ");
			int user = input.nextInt();

			System.out.print("The computer is ");
			switch (computer) {
			case 0:
				System.out.print("scissor.");
				break;
			case 1:
				System.out.print("rock.");
				break;
			case 2:
				System.out.print("paper.");
				break;
			}

			System.out.print(" You are ");
			switch (user) {
			case 0:
				System.out.print("scissor");
				break;
			case 1:
				System.out.print("rock");
				break;
			case 2:
				System.out.print("paper ");
			}

			if (computer == user)
				System.out.println(" too. It is a draw");
			else if (isWin(user, computer)) {
				youWin++;
				System.out.println(". You won");
			} else {
				System.out.println(". You lose");
				computerWins++;
			}
		} while (Math.abs(computerWins - youWin) <= 2);
		
		System.out.println("Your score is " + youWin);
		System.out.println("The computer's score is " + computerWins);
	}

	private static boolean isWin(int user, int computer) {
		return (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
	}
}
