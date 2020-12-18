package chapter05;

public class Q18B {
	
	public static void main(String[] args) {
		
		int line = 6;
		int var = 6;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= var; j++ ) {
				System.out.print(j + " ");
			}
			var--;
			System.out.println();
		}
	}

}
