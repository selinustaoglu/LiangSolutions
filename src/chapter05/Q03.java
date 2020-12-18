package chapter05;

public class Q03 {
	public static void main(String[] args) {
		final double POUNDS_PER_KG = 2.2;

		System.out.printf("%-10s%10s\n", "Kilograms", "Pounds");

		for (int n = 1; n <= 199; n += 2)
			System.out.printf("%-10d%10.1f\n", n, n * POUNDS_PER_KG);

	}

}
