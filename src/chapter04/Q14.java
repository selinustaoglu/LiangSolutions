package chapter04;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String s = input.next();
		char grade = s.charAt(0);
		
		switch (grade) {
			case 'A':System.out.println("The numeric value for grade " + grade + " is 4");break;
			case 'B':System.out.println("The numeric value for grade " + grade + " is 3");break;
			case 'C':System.out.println("The numeric value for grade " + grade + " is 2");break;
			case 'D':System.out.println("The numeric value for grade " + grade + " is 1");break;
			case 'F':System.out.println("The numeric value for grade " + grade + " is 0");break;
			default:System.out.println(grade +" is an invalid grade");break;
			}
		}
			
	}


