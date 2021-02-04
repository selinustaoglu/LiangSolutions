package chapter06;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter milliseconds: ");
		long milliseconds = input.nextLong();

		System.out.println("hours:minutes:seconds: " + convertMillis(milliseconds));

	}
 
	public static String convertMillis(long milliseconds) {
		milliseconds /= 1000;

		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + milliseconds % 60 + currentMinuteAndSecond;
			milliseconds /= 60;
		}
		return milliseconds + currentMinuteAndSecond;
	}
}
