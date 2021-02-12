package chapter06;

public class Q30 {

	public static int rollDice() {
		return (int) (1 + Math.random() * 6);
	}

	public static int rollDiceTwice() {
		int dice1 = rollDice();
		int dice2 = rollDice();
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}

	public static int getresult(int point) {
		switch (point) {
		case 2:
		case 3:
		case 12:point = 0;break;
		case 7:
		case 11:point = 1;break;
		}
		return point;
	}

	public static boolean isCrapsOrNatural(int result) {
		return result == 0 || result == 1;
	}

	public static void printResult(int result) {
		if (result == 0)
			System.out.println("You lose");
		else if (result == 1)
			System.out.println("You win");
	}

	public static void rollTillWinOrLose(int point) {
		int result = 0;

		result = rollDiceTwice();
		
		while(result != 7 && point != result) {
			result = rollDiceTwice();
		}
		
		if (result == 7)
			printResult(0);
		else
			printResult(1);
	}
	
	public static int playCraps() {
		int point = rollDiceTwice();

		int result = getresult(point);

		if (isCrapsOrNatural(result))
			printResult(result);
		else {
			rollTillWinOrLose(result);
	}
		return result;
	}
	public static void main(String[] args) {
			playCraps();
		}
	
}
