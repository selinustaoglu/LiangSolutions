package chapter09.q08;

public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;
	
	// data-fields
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	// no-arg constructor
	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	// Accessor methods

	int getSpeed() {
		return speed;
	}

	boolean getOn() {
		return on;
	}

	double getRadius() {
		return radius;
	}

	String getColor() {
		return color;
	}

	// Mutator methods
	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	void setOn(boolean newSetting) {
		on = newSetting;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}

	void setColor(String newColor) {
		color = newColor;
	}

	// methods

	public String toString() {
		if (getOn()) {
			return "speed: " + getSpeed() + " color: " + getColor() + " radius: " + getRadius();
		} else {
			return" color: " + getColor() + " radius: " + getRadius() + " fan is off.";
		}
	}
}
