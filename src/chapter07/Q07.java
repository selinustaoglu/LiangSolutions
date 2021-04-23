package chapter07;


public class Q07 {

	public static void main(String[] args) {
		int [] nums = generateArray();
		int [] count = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
		}
		printOccurence(count);
	}
	
	
	public static int[] generateArray() {
		int [] numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] =  (int)(Math.random() * 10); 
		}
		return numbers;
	}
	
	public static void printOccurence(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " occurs " + array[i] + " times.");
		}
	}
}
