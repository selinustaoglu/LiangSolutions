package chapter06;

public class Q30 {

	public static int rollDice() {
		return (int) (1 + Math.random() * 6);
	}

	public static int rollDiceTwice(boolean print) {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int sum = dice1 + dice2;
		if (print)
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}

	public static boolean isCraps(int point) {
		return point == 2 || point == 3 || point == 12;
	}

	public static boolean isNatural(int point) {
		return point == 7 || point == 11;
	}

	public static void printResult(boolean win) {
		if (win)
			System.out.println("You win");
		else
			System.out.println("You lose");
	}

	public static boolean rollTillWinOrLose(int point, boolean print) {
		int newPoint = rollDiceTwice(print);

		while (newPoint != 7 && point != newPoint) {
			newPoint = rollDiceTwice(print);
		}
		return newPoint == point;
	}

	public static boolean playCraps(boolean print) {
		int point = rollDiceTwice(print);

		boolean win;
		if (isNatural(point)) {
			win = true;
		} else if (isCraps(point)) {
			win = false;
		} else {
			win = rollTillWinOrLose(point, print);
		}
		if (print)
			printResult(win);
		return win;
	}

	public static void main(String[] args) {
		playCraps(true);
	}

}
