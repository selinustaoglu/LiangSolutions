package chapter07;

public class Q18 {

	public static void main(String[] args) {
		System.out.println("Enter ten random integers:");
		int[] numbers = Chapter7Util.scanIntArray(10);
		
		System.out.println("The sorted array is:");
		bubbleSort(numbers);
		Chapter7Util.arrayPrint(numbers);
	}
	
	public static void bubbleSort(int [] array) {
		int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
            
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
			}
			
		}
		
	}


