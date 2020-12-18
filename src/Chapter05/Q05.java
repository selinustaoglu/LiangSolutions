package chapter05;

public class Q05 {
	public static void main(String[] args) {
		final double POUNDS_PER_KG = 2.2;

		System.out.printf("%-10s%10s%5s%4s%-10s%10s\n", "Kilograms", "Pounds", "|", "", "Pounds", "Kilograms");

		for (int k = 1, p = 20; k <= 199; k += 2, p += 5 ) 
			System.out.printf("%-10d%10.1f%5s%4s%-10d%10.2f\n", k, k * POUNDS_PER_KG, "|", "", p, p / POUNDS_PER_KG);
	}
}
