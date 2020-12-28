package chapter05;

import java.util.Scanner;

public class Q51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = input.nextLine();

		int index = 0;
		String prefix = "";

		while (string1.charAt(index) == string2.charAt(index)) {
			prefix += string1.charAt(index);
			index++;
		}

		if (prefix.length() >= 2)
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(string1 + " and " + string2 + " have no commmon prefix");
	}

}
