package chapter03;

public class Q24 {

	public static void main(String[] args) {
		int suit = (int)(Math.random() * 4 + 1);
		int rank = (int)(Math.random() * 13 + 1);
		
		System.out.print("The card you picked is ");
		
		switch (rank) {
		case 1:System.out.print("Ace of"); break;
		case 2:System.out.print("Two of"); break;
		case 3:System.out.print("Three of"); break;
		case 4:System.out.print("Four of");break;
		case 5:System.out.print("Five of");break;
		case 6:System.out.print("Six of");break;
		case 7:System.out.print("Seven of");break;
		case 8:System.out.print("Eight of");break;
		case 9:System.out.print("Nine of");break;
		case 10:System.out.print("Ten of");break;
		case 11:System.out.print("Jack of");break;
		case 12:System.out.print("Queen of");break;
		case 13:System.out.print("King of");break;
		}
		
		switch (suit) {
		case 1:System.out.print(" Diamonds");break;
		case 2:System.out.print(" Clubs");break;
		case 3:System.out.print(" Hearts");break;
		case 4:System.out.print(" Spades");break;
		}
	}

}
