package chapter09.q09;

public class Test {

	public static void main(String[] args) {
		
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6,4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Polygon 1 has perimeter: " + polygon1.getPerimeter() + " and area: " + polygon1.getArea());
		System.out.println("Polygon 2 has perimeter: " + polygon2.getPerimeter() + " and area: " + polygon1.getArea());
		System.out.println("Polygon 3 has perimeter: " + polygon3.getPerimeter() + " and area: " + polygon1.getArea());

	}
}
