package chapter06;

public class Q01 {

	public static void main(String[] args) {
		final int NUMBER_PER_ROW = 10;
		int count = 0;
		int num;
		for (int i = 1; i <= 100; i++) {
			num = getPentagonalNumber(i);
			System.out.printf("%6d", num);
			
			if (++count % NUMBER_PER_ROW == 0)
				System.out.println();
		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}

}
