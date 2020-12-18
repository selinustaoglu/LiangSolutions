package chapter05;

public class Q24 {

	public static void main(String[] args) {
		double number = 0;
		
		for(int i = 1; i <= 99; i += 2) {
			number += i / i + 2;
		
		}
		System.out.println(number);
	}

}
