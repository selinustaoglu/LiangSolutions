package chapter07;

import java.util.Scanner;

public class Chapter7Util {

	public static void arrayPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void arrayPrint(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static <E> void arrayPrint(E[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void integerArrayPrintWithoutZeros(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0)
			System.out.print(array[i] + " ");
		}
	}
	
	public static double[] scanDoubleArray(int index) {
		
		double [] array = new double[index];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i]= input.nextDouble();
		}
		return array;
	}
	
	public static int[] scanIntArray(int index) {
		
		int [] array = new int[index];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i]= input.nextInt();
		}
		return array;
	}
	
	public static String[] scanStringArray(int index) {
		
		String[] array = new String[index];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i]= input.next();
		}
		return array;
		
	}
}
