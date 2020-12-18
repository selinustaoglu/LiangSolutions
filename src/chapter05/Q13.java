package chapter05;

public class Q13 {

	public static void main(String[] args) {
		int number = 25;
		
		while (number * number * number > 12000)
			number--;
		
		System.out.println(number);
	}

}
