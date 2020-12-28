package chapter05;

public class Q39 {

	public static void main(String[] args) {
		final double COMMISSION_SOUGHT = 25000; 
		
		double salesAmount = 0;
		double commission;				
		
		do {
			salesAmount++;
			
			if (salesAmount < 5000)
				commission = salesAmount * 0.08;
			else if (salesAmount < 10000)
				commission = (salesAmount - 5000) * 0.10 + 5000 * 0.08;
			else 
				commission = (salesAmount - 10000) * 0.12 + 5000 * 0.10 + 5000 * 0.08;
			
		} while (commission < COMMISSION_SOUGHT);

		
		System.out.printf("Minimum sales to earn $30,000: $%.0f", salesAmount);
		}

	}

