package chapter05;

public class Q19 {

	public static void main(String[] args) {
		
		int line = 8;
		
		for (int i = 0; i < line; i++) {
			for (int j = line - i; j > 1; j--)
				System.out.print("    ");
			
			for (int j = 0; j <= i; j++)
				System.out.printf("%4d", (int)Math.pow(2, j));
			
			// for
			
			System.out.println();
		}
	}
}
