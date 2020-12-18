package chapter05;

public class Q40 {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;

		for (int i = 1; i <= 100_000_000; i++) {

			boolean headOrTail = Math.random() < 0.5;

			if (headOrTail == true)
				heads++;
			else
				tails++;
		}
		
		System.out.println("Number of heads is: " + heads);
		System.out.println("Number of tails is: " + tails);

	}
}
