package chapter05;

public class Q15 {

	public static void main(String[] args) {
		final int NUMBERS_PER_LINE = 10;
		int count = 0;
		
		for (char i = '!'; i <= '~'; i++) {
			System.out.print(i + " ");
			count++;
			
			if (count % NUMBERS_PER_LINE == 0)
				System.out.println();
			}

	
	}

}
