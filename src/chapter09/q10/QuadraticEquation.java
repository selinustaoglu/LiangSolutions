package chapter09.q10;

public class QuadraticEquation {

	//data-fields
	private double a;
	private double b;
	private double c;
	
	//Constructor
	QuadraticEquation(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	
	//Accessors
	
	double getA() {
		return a;
	}
	
	double getB() {
		return b;
	}
	
	double getC() {
		return c;
	}
	
	//Methods
	
	double getDiscriminant() {
		return (Math.pow(b, 2) - (4*a*c));
	}
	
	double getRoot1() {
		return (-b+Math.sqrt(getDiscriminant())) / 2 * a;
	}
	
	double getRoot2() {
		return (-b-Math.sqrt(getDiscriminant())) / 2 * a;
	}
}
