package chapter09.q05;

import java.util.*;

public class q05 {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();

		System.out.println(date.get(date.MONTH) + "/" + date.get(date.DAY_OF_MONTH) + "/" + date.get(date.YEAR));
		
		System.out.println("Elapsed time since January 1, 1970 set to " + "1234567898765L in format Mth/Day/Year: ");
		
		System.out.println(date.get(date.MONTH) + "/" + date.get(date.DAY_OF_MONTH) + "/" + date.get(date.YEAR));
	}

}
