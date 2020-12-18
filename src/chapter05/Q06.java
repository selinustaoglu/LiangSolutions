package chapter05;

public class Q06 {

	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609;
		
		System.out.printf("%-10s%10s%5s%4s%-10s%10s\n", "Miles", "Kilometers", "|", "", "Kilometers", "Miles");
		
		for (int i = 1, j = 20; i <= 10; i++, j += 5) {
			System.out.printf("%-10d%10.3f%5s%4s%-10d%11.3f\n", i , i * KM_PER_MILE,"|", "", j, j / KM_PER_MILE);
		}
	}

}
