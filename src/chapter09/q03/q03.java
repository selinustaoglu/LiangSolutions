package chapter09.q03;

import java.util.Date;

public class q03 {

	public static void main(String[] args) {
		Date date = new Date(10_000);
		System.out.println(date);
		
		date.setTime(100_000);
		System.out.println(date);
		
		date.setTime(1_000_000);
		System.out.println(date);
		
		date.setTime(10_000_000);
		System.out.println(date);
		
		date.setTime(100_000_000);
		System.out.println(date);
		
		date.setTime(1_000_000_000);
		System.out.println(date);
		
		date.setTime(10_000_000_000L);
		System.out.println(date);
		
		date.setTime(100_000_000_000L);
		System.out.println(date);
		
		date.setTime(1_000_000_000_000L);
		System.out.println(date);
		
		date.setTime(10_000_000_000_000L);
		System.out.println(date);
		
		date.setTime(Long.MAX_VALUE);
		System.out.println(date);
	}

}
