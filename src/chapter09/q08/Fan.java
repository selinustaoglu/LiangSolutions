package chapter09.q08;

public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	// data-fields
	private SpeedType speed;
	private boolean on;
	private double radius;
	private String color;

	// no-arg constructor
	public Fan() {
		speed = SpeedType.SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	// methods
	public boolean isOn() {
		return on;
	}

	public SpeedType getSpeed() {
		return speed;
	}

	public void setSpeed(SpeedType speed) {
		this.speed = speed;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (isOn()) {
			return "speed: " + getSpeed() + " color: " + getColor() + " radius: " + getRadius();
		} else {
			return" color: " + getColor() + " radius: " + getRadius() + " fan is off.";
		}
	}
}
