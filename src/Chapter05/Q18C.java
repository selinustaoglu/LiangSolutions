package chapter05;

public class Q18C {

	public static void main(String[] args) {
		
		int line = 6;
		
		for (int l = 0; l < line; l++) {
			for (int i = line - l; i > 0; i--)
				System.out.print("  ");
			for (int s = l + 1; s >0 ; s--)
				System.out.print(s + " ");
			
			System.out.println();
		}
	}

}
