package chapter05;

import java.util.Scanner;

public class Q36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		String isbn = input.nextLine();

		int d10 = 0;

		for (int i = 0; i < 9; i++) {
			d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
		}

		d10 %= 11;

		System.out.print(isbn);
		if (d10 == 10)
			System.out.println("X");
		else
			System.out.println(d10);
	}

}
