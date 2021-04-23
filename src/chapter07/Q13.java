package chapter07;

public class Q13 {

	public static void main(String[] args) {
		// bu method tipi nasil kullaniliyor??
		
		getRandom(5, new int[]{1, 2, 3});
		
		
		getRandom(1, 2, 3);
		
		int[] ia = {1, 2, 3};
		// long[] la = ia;
		
		// byte[] array = malloc(size(int) * 50);

	}
	
	public static int getRandom(int a, int... numbers) {
		
		int randomNumber = (int)(Math.random() * ((53) + 1)) + 1;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] != randomNumber)
				break;
		}
		return randomNumber;
	}

}
