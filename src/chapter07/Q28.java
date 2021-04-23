package chapter07;

public class Q28 {

	public static void main(String[] args) {
		System.out.print("Enter ten numbers: ");
		
		int[] numbers = Chapter7Util.scanIntArray(10);

		printCombinations(numbers);
	}
	
	public static void printCombinations(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j)
					System.out.println(numbers[i] + " " + numbers[j]);
			}
		}
	}

}
