package chapter06;

public class Q38 {

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	public static void main(String[] args) {
		int digitCount = 100;
		int letterCount = 100;
		int counter = 0;
		while (digitCount > 0 && letterCount > 0) {
			
			if (Math.random() > 0.5) {
				System.out.print(getRandomUpperCaseLetter());
				letterCount--;
			} else {
				System.out.print(getRandomDigitCharacter());
				digitCount--;
			}

			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}
		
		while (digitCount > 0) {
			System.out.print(getRandomDigitCharacter());
			digitCount--;
			
			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}
		
		while (letterCount > 0) {
			System.out.print(getRandomUpperCaseLetter());
			letterCount--;
			
			counter++;
			if (counter % 10 == 0)
				System.out.println();
		}
		
		System.out.println();
		System.out.println("digitCount = " + digitCount);
		System.out.println("letterCount = " + letterCount);
	}

}
