package chapter09.q13;

public class Location {

	public int row;
	public int column;
	public double maxValue;

	private Location(double[][] array) {
		this.row = 0;
		this.column = 0;
		this.maxValue = array[row][column];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > maxValue) {
					row = i;
					column = j;
					maxValue = array[i][j];
				}
			}
		}
	}

	public static Location locateLargest(double[][] array) {
		return new Location(array);
	}
}
