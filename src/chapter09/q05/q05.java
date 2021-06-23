package chapter09.q05;

import java.util.*;

public class q05 {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();

		System.out.println(date.get(Calendar.MONTH) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR));
		
		System.out.println("Elapsed time since January 1, 1970 set to " + "1234567898765L in format Mth/Day/Year: ");
		
		System.out.println(date.get(Calendar.MONTH) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR));
	}

}
