package chapter06;

public class Q32 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			if (Q30.playCraps(false))
				count++;
		}
		System.out.println("Number of winning games: " + count);
	}

}
