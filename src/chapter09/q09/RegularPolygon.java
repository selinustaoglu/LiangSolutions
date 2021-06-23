package chapter09.q09;

public class RegularPolygon {

	//data-fields
	private int n;
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon(){
		this(3, 1, 0, 0);
	}
	
	public RegularPolygon(int n, double side){
		this(n, side, 0, 0);
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public double getPerimeter() {
		return n * side;
	}
	
	public double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}

	public int getNumberOfSides() {
		return n;
	}
	
	public double getSideLength() {
		return side;
	}
	
	public double getXCoordinate() {
		return x;
	}
	
	public double getYCoordinate() {
		return y;
	}
	
	public void setNumberOfSides(int n) {
		this.n = n;
	}
	
	public void setSideLength(int side) {
		this.side = side;
	}
	
	public void setXCoordinate(int x) {
		this.x = x;
	}

	public void setYCoordinate(int y) {
		this.y = y;
	}
	
}
