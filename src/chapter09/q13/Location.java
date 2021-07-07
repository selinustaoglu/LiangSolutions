package chapter09.q13;

public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	Location(double[][] array){
		
		row = 0;
		column = 0;
		maxValue = array[row][column];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i][j] > maxValue) {
					row = i;
					column = j;
					maxValue = array[i][j];
				}
			}
		}
	}
	
	public static Location locateLargest(double[][] array) {
		Location location = new Location(array);
		return location;
	}
}
