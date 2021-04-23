package chapter07;

public class Q20 {

	public static void main(String[] args) {

		System.out.println("Enter 10 random integers");

		double[] numbers = Chapter7Util.scanDoubleArray(10);
		selectionSort(numbers);
		Chapter7Util.arrayPrint(numbers);

	}

	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
