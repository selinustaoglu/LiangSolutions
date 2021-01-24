package chapter06;

import java.util.Scanner;

public class Q17 {
	
	public static void printMatrix(int n) {
		int lines = 0;
		
		for (int i = 0; i < n * n; i++) {
			System.out.print(Math.round(Math.random()) + " " );
			lines ++;
			
			if(lines % n == 0) {
				System.out.println();
				lines = 0;
			}
		}
	}

	public static void main(String[] args) {
		printMatrix(5);
	}

}
