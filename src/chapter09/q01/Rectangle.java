package chapter09.q01;

public class Rectangle {
	
	//width and height of rectangle
	double width = 1;
	double height = 1;
	
	Rectangle(){ //no-argument constructor 
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * width + 2 * height;
	}
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4,40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of rectangle 1 is : " + rec1.width);
		System.out.println("The height of rectangle 1 is : " + rec1.height);
		System.out.println("The area of rectangle 1 is : " + rec1.getArea());
		System.out.println("The perimeter of rectangle 1 is : " + rec1.getPerimeter());
		
		System.out.println();
		
		System.out.println("The width of rectangle 2 is : " + rec2.width);
		System.out.println("The height of rectangle 2 is : " + rec2.height);
		System.out.println("The area of rectangle 2 is : " + rec2.getArea());
		System.out.println("The perimeter of rectangle 2 is : " + rec2.getPerimeter());
	}
}
