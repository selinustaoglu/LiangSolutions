package chapter07;

public class Q12 {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");

		int[] numbers = Chapter7Util.scanIntArray(10);

		reverse(numbers);

		Chapter7Util.arrayPrint(numbers);

	}

	public static int[] reverse(final int[] list) {

		int temp;
		
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		
		return list;
	}

}
