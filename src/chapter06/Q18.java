package chapter06;

public class Q18 {
	
	public static void passwordChecker(String password) {
		boolean atLeast8Digits = false;
		boolean atLeast2isDigits = false;
		boolean lettersAndDigits = true;
		int count = 0;
		
		if(password.length() >= 8)
			atLeast8Digits = true;
		
		for (int i = 0; i < password.length(); i++) {
			if(! ( (Character.isDigit(password.charAt(i))) ||   (Character.isLetter(password.charAt(i)))    ) ) {
				lettersAndDigits = false;
				continue;
			}
		}
		
		for (int i = 0; i < password.length(); i++) {
			if ( Character.isDigit(password.charAt(i)) ) {
				count ++;
			}
		}	
		
		if(count >= 2)
			atLeast2isDigits = true;
		
		
		if(atLeast2isDigits && atLeast8Digits && lettersAndDigits)
			System.out.print("Valid Password");
		else
			System.out.println("Invalid Password");
		
	}

	public static void main(String[] args) {
		passwordChecker("1abyedr");

	}

}
