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
		for (int i = 1; i <= 100; i++) {
			System.out.print(getRandomUpperCaseLetter());
			
			if(i % 10 == 0)
				System.out.println();
		}
		for (int i = 1; i <= 100; i++) {
			System.out.print(getRandomDigitCharacter());
			
			if(i % 10 == 0)
				System.out.println();
		}
	}

}
