package chapter06;

public class Q06 {

	public static void displayPattern(int n) {

		for (int l = 0; l < n; l++) {
			for (int i = n - l; i > 0; i--)
				System.out.print("  ");
			for (int s = l + 1; s > 0; s--)
				System.out.print(s + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) {
		displayPattern(10);
	}

}
