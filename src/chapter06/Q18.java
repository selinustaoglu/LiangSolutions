package chapter06;

public class Q18 {

	public static boolean isPpasswordValid(String password) {
		int count = 0;

		if (password.length() < 8)
			return false;

		for (int i = 0; i < password.length(); i++) {
			if (!((Character.isDigit(password.charAt(i))) || (Character.isLetter(password.charAt(i))))) {
				return false;
			}
		}

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				count++;
			}
		}

		if (count < 2)
			return false;

		return true;
	}

	public static void main(String[] args) {

		if (isPpasswordValid("1abyedr"))
			System.out.print("Valid Password");
		else
			System.out.println("Invalid Password");

	}

}
