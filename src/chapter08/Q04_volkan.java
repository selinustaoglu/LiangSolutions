package chapter08;

public class Q04_volkan {

	public static void main(String[] args) {
		int[][] calendar = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int[][] hours = computeHours(calendar);
		sortHours(hours);
		printHours(hours);

	}

	public static int[][] computeHours(int[][] m) {
		int[][] hours = new int[m.length][2];

		// compute the hours of each employee
		for (int i = 0; i < m.length; i++) {
			hours[i][0] = i;

			int hourSum = 0;
			for (int j = 0; j < m[0].length; j++) {
				hourSum += m[i][j];

			}
			hours[i][1] = hourSum;
		}
		return hours;
	}

	public static void sortHours(int[][] hours) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < hours.length - 1; i++) {
				if (hours[i][1] > hours[i + 1][1]) {
					int[] temp = hours[i];
					hours[i] = hours[i + 1];
					hours[i + 1] = temp;
					sorted = false;
				}
			}
		}
	}

	public static void printHours(int[][] m) {

		for (int i = m.length - 1; i >= 0; i--) {
			System.out.println("Employee " + m[1][i] + " has worked for " + m[0][i] + " hours.");
		}
	}

}
