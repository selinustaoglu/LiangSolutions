package chapter05;

public class Q18A {

	public static void main(String[] args) {

		int i = 0;
		while (i < 7) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
			i++;
		}
		/*
		 * for (int i = 1; i <= 6; i++) { for (int j = 1; j < 5 - i; j++) {
		 * System.out.print("  "); }
		 * 
		 * for (int j = i; j >= 1; j--) { System.out.print(j + " "); }
		 * System.out.println(); }
		 * 
		 */

	}

}
