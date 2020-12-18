package chapter04;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		String city1 = input.next();
		System.out.println("Enter the second city: ");
		String city2 = input.next();
		System.out.println("Enter the third city: ");
		String city3 = input.next();
		
		
		// 5 4 1 
		// 4 5 1
		// 4 1 5
		// 1 4 5
		if (city1.compareTo(city2) > 0) {
			String temp = city1;
			city1 = city2;
			city2 = temp;
		}
		
		if (city2.compareTo(city3) > 0 ) {
			String temp = city2;
			city2 = city3;
			city3 = temp;
			
		}
		
		if (city1.compareTo(city2) > 0) {
			String temp = city1;
			city1 = city2;
			city2 = temp;
		}
		
		System.out.println(city1 + " - " + city3 + " - " + city3);
		
		

	}

}
