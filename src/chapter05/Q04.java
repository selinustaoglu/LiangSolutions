package chapter05;

public class Q04 {

	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609;
		
		System.out.printf("%-10s%10s\n" ,"Miles", "Kilometers");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-10d%5.3f\n" , i , i * KM_PER_MILE);
			
		}
			

	}

}
