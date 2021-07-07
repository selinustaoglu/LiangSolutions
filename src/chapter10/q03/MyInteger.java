package chapter10.q03;

public class MyInteger {

	// data-fields
	int value;

	// constructor
	public MyInteger(int value) {
		this.value = value;
	}

	// accessor
	public int getValue() {
		return value;
	}

	//methods
	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return value % 2 != 0;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if(value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger integer) {
		return integer.value % 2 == 0;
	}
	
	public static boolean isOdd(MyInteger integer) {
		return integer.value % 2 != 0;
	}
	
	public static boolean isPrime(MyInteger integer) {
		for (int i = 2; i < integer.value; i++) {
			if(integer.value % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int number) {
		return value == number;
	}
	
	public boolean equals(MyInteger integer) {
		return this.value == integer.value;
	}
	
	public static int parseInt(char[] array) {
		 int number = Integer.parseInt(String.valueOf(array));
	        return number; 
	}
	
	public static int parseInt(String s) {
		 int number = Integer.parseInt(s);
		 return number;
	}
}
