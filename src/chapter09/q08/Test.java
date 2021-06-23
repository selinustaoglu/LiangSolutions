package chapter09.q08;

public class Test {
	
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(SpeedType.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed(SpeedType.MEDIUM);
		
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
		

	}

}
