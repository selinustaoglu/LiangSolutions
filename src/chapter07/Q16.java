package chapter07;

import java.util.Arrays;

public class Q16 {

	public static void main(String[] args) {
		
		final int N = 100_000_000;
		System.out.println("N = " + N);
		
		long startTime = System.currentTimeMillis();
		int[] numbers = randomBigArray(N);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the randomBigArray in milliseconds: " + executionTime);
		
		int key = getRandomInt(N);

		startTime = System.currentTimeMillis();
		linearSearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the linearSearch in milliseconds: " + executionTime);
		
		
		startTime = System.currentTimeMillis();
		// selectionSort(numbers);
		Arrays.sort(numbers);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the selectionSort in milliseconds: " + executionTime);
		
		
		startTime = System.currentTimeMillis();
		binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Execution time of invoking the binarySearch in milliseconds: " + executionTime);
		
	}

	public static int[] randomBigArray(final int N) {
		int array[] = new int[N];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomInt(N);
		}

		return array;
	}

	public static int getRandomInt(final int N) {
		return 1 + (int) (Math.random() * N);
	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}

		return -low - 1; // Now high < low
	}
	
	 public static void selectionSort(int[] list) {
		    for (int i = 0; i < list.length - 1; i++) {
		      // Find the minimum in the list[i..list.length-1]
		      int currentMin = list[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < list.length; j++) {
		        if (currentMin > list[j]) {
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
