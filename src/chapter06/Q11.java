package chapter06;

public class Q11 {
	// bu programda sikinti olabilir
	public static double computeCommision(double salesAmount) {
		double commission;

		if (salesAmount < 5000)
			commission = salesAmount * 0.08;
		else if (salesAmount < 10000)
			commission = (salesAmount - 5000) * 0.10 + 5000 * 0.08;
		else
			commission = (salesAmount - 10000) * 0.12 + 5000 * 0.10 + 5000 * 0.08;

		return commission;
	}

	public static void main(String[] args) {
		System.out.println("Sales Amount     Commision\n" + "---------------------------");

		for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf("%3d", salesAmount);
			System.out.printf("%20.1f\n", computeCommision(salesAmount));
		}

	}

}
