package chapter06;

public class Q31 {
	

	public static void main(String[] args) {
		// read card number 
		
		if (isValid(0)) {
			
		} else {
			
		}

	}

	
	public static boolean isValid(long number) {
		if (!prefixMatched(number, 4) || !prefixMatched(number, 5)) {
			return false;
		}
		
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		return 0;
	}
	
	/** Return this number if it is a single digit, otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number){
		if (number <= 9)
			return number;
		else
			return (number / 10) + (number % 10);
	}
	
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String temp = number + "";
		int[] numberArray = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    numberArray[i] = temp.charAt(i) - '0';
		    if(i % 2 != 0) {
		    	sum+= numberArray[i];
		    }
		}
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		int size = getSize(d);
		return d == getPrefix(number, size);
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}
	
	/** Return the first k number of digits from number. If the
	* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		return 0;
	}
}
