package chapter03;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		int coinFlip = (int) (Math.random() * 2);
		
		if (coinFlip == 1)
			System.out.println("Tails");
		else
			System.out.println("Heads");
	}

}
