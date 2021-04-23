package chapter07;

public class Q10 {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");

		double [] numbers = Chapter7Util.scanDoubleArray(10);
		
		System.out.println("The index of the smallest element is: " + indexOfSmallestElement(numbers));
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];
		int index = 0;
		
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

}
