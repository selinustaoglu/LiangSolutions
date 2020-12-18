package chapter05;

public class Q18D {

	public static void main(String[] args) {
		
		for (int line = 0; line <= 6; line++) {

			for (int j = 6 - line; j < 6; j++)
				System.out.print("  ");
			
			for (int i = 1 ; i <= 6 - line; i++)
				System.out.print(i + " ");
			
			
			System.out.println();
		}
	}

}
