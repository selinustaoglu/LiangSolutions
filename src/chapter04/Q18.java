package chapter04;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String s = input.next();
		char field = Character.toUpperCase(s.charAt(0));
		int year = s.charAt(1) - '0';
		
		if (!((field == 'M' || field == 'C' || field == 'I') 
				&& (year == 1 || year == 2 || year == 2 || year == 4))) {
			System.out.println("Invalid input");
			return;
		}
		
		switch (field) {
		case 'M': System.out.print("Mathematics ");break;
		case 'C': System.out.print("Computer Science ");break;
		case 'I': System.out.print("Information Technology ");break;
		}
		
		switch (year) {
		case 1: System.out.println("Freshman");break;
		case 2: System.out.println("Sophomore");break;
		case 3: System.out.println("Junior");break;
		case 4: System.out.println("Senior");break;
		}
		
	}

}
