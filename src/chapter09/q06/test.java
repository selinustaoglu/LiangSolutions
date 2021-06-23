package chapter09.q06;

public abstract class test {

	public static void main(String[] args) {
		
		Stopwatch stopwatch = new Stopwatch();
		
		int[] array = getArray();
		
		stopwatch.start();
		
		selectionSort(array);
		
		stopwatch.stop();
		
		System.out.println("The elapsed time is " + stopwatch.getElapsedTime() + " milliseconds");
		
	}
	
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	}
	
	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}
	
}

