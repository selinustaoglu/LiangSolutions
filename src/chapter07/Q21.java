package chapter07;

import java.util.Random;
import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of slots:");
		int slotNumber = input.nextInt();

		System.out.print("Enter the numbers of balls:");
		int ballNumber = input.nextInt();

		int[] slots = ballDrop(slotNumber, ballNumber);
		System.out.println();
		Chapter7Util.arrayPrint(slots);
		System.out.println();
		displayHistogram(slots);
	}

	public static int[] ballDrop(int slotNumber, int ballNumber) {

		int[] slots = new int[slotNumber];

		for (int i = 1; i <= ballNumber; i++) {
			int count = 0;
			char[] path = createPath(slotNumber);
			System.out.println(path);

			for (int j = 0; j < path.length; j++) {
				if (path[j] == 'R')
					count++;
			}

			slots[count - 1] = slots[count - 1] + 1;
		}

		return slots;
	}

	public static char[] createPath(int slotNumber) {

		char L = 'L';
		char R = 'R';

		char[] path = new char[slotNumber];

		for (int i = 0; i < path.length; i++) {
			Random rd = new Random();

			if (rd.nextBoolean()) {
				path[i] = L;
			} else {
				path[i] = R;
			}
		}
		return path;
	}

	public static void displayHistogram(int[] list) {
		int max = max(list);

		while (max > 0) {
			System.out.println();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= max) {
					System.out.print("O");
				} else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
	}

	public static int max(int[] array) {

		int max = array[0];
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];

		return max;
	}
}