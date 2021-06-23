package chapter08;

public class Q04 {

	public static void main(String[] args) {
		int [][] calendar = { { 2, 4, 3, 4, 5, 8, 8 },
				{ 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 },
				{ 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		
		int[][] hours = computeHours(calendar);
		sortHours(hours);
		printHours(hours);

	}
	
	public static int[][] computeHours(int[][] m){
		int [][] hours = new int [2][7];
		
		//compute the hours of each employee
		for(int i = 0; i < m.length; i++) {
			int hourCount = 0;
			for (int j = 0; j < m[0].length; j++) {
				hourCount += m[i][j];
				if(i == 1) {
					hours[1][j] = j;
				}
			}
			hours[0][i] = hourCount;
		}
		return hours;
	}
	
	public static void sortHours(int[][] a) {
		boolean sorted = false;
	    int temp,temp2;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[0][i] > a[0][i+1]) {
	                temp = a[0][i];
	                temp2 = a[1][i];
	                
	                a[0][i] = a[1][i+1];
	                a[1][i] = a[2][i+1];
	                
	                a[0][i+1] = temp;
	                a[1][i+1] = temp2;
	                sorted = false;
	            }
	        }
	    }
	}
	
	public static void printHours(int[][] m) {
		
		for (int i = m.length-1; i >= 0; i--) {
			System.out.println("Employee " + m[1][i] + " has worked for " + m[0][i] + " hours.");
		}
	}

}
