package chapter07;

public class Q15 {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");

		int[] numbers = Chapter7Util.scanIntArray(10);
		
		Chapter7Util.integerArrayPrintWithoutZeros(eliminateDuplicates(numbers));
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctArray = new int[10];
		boolean isDistinct = true;
		int count = 0;
		
		for(int i = 0; i<list.length; i++) {
			isDistinct = true;
			for (int j = 0; j < count; j++) {
				if(list[i] == distinctArray[j]) {
					isDistinct = false;
				}
			}
			if(isDistinct) {
				
				distinctArray[count] = list[i];
				count++;
			}
		}
		return distinctArray;
	}

}
