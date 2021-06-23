package chapter09.q09;

public class RegularPolygon {

	//data-fields
	int n;
	double side;
	double x;
	double y;
	
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;	
	}
	
	RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
		x = 0;
		y = 0;
	}
	
	RegularPolygon(int newN, double newSide, double newX, double newY){
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	int getNumberOfSides() {
		return n;
	}
	
	double getSideLength() {
		return side;
	}
	
	double getXCoordinate() {
		return x;
	}
	
	double getYCoordinate() {
		return y;
	}
	
	void setNumberOfSides(int newSide) {
		n = newSide;
	}
	
	void setSideLength(int newLength) {
		side = newLength;
	}
	
	void setXCoordinate(int newX) {
		x = newX;
	}

	void setYCoordinate(int newY) {
		y = newY;
	}
	
	double getPerimeter() {
		return n * side;
	}
	
	double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}
}
