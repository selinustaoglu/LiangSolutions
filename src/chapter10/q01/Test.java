package chapter10.q01;

public class Test {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.println("Time is " + time1.hour + ":" + time1.minute + ":" + time1.second);
		
		System.out.println("Elapsed time is " + time2.hour + ":" + time2.minute + ":" + time2.second);
	}

}
