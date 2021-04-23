package chapter07;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] createDeck() {

		int[] deck = new int[52];

		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		return deck;
	}
}