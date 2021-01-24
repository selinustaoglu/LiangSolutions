package chapter06;

public class Q09 {

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

	public static void main(String[] args) {
		System.out.println("Feet     Meters    |     Meters     Feet");
		System.out.println("----------------------------------------------");
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
			System.out.printf("%4.1f     ", feet);
			System.out.printf("%4.3f", footToMeter(feet));
			System.out.print("     |     ");
			System.out.printf("%-9.1f", meters);
			System.out.printf("%7.3f", meterToFoot(meters));
			System.out.println();
		}
	}

}
