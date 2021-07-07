package chapter07;

public class Q09 {
	

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");
		
		double [] numbers = Chapter7Util.scanDoubleArray(10);
		
		double min = min(numbers);
		
		System.out.println("The minimum number is " + min);
	
	}
	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}

}
