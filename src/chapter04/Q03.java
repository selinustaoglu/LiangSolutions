package chapter04;

public class Q03 {

	public static void main(String[] args) {
		
		double side1 = Math.sqrt(Math.pow((33.7489954 - 35.2270869), 2) + Math.pow((-84.3879824 -  -80.8431267), 2)); // Charlotte - Atlanta
		double side2 = Math.sqrt(Math.pow((33.7489954 - 28.5383355), 2) + Math.pow((-84.3879824 -  -81.3792365), 2)); // Atlanta - Orlando
		double side3 = Math.sqrt(Math.pow((35.2270869 - 28.5383355), 2) + Math.pow((-80.8431267 -  -81.3792365), 2)); // Charlotte - Orlando
		
		double s1 = (side1 + side2 + side3) / 2;
		
		double area1 = Math.sqrt(s1 * (s1 - side1) * (s1 - side2) * (s1 - side3));
		
		double side4 = Math.sqrt(Math.pow((35.2270869 - 32.0835407), 2) + Math.pow((-80.8431267 -  -81.0998342), 2)); // Charlotte - Savannah
		double side5 = Math.sqrt(Math.pow((32.0835407 - 28.5383355), 2) + Math.pow((-81.0998342 -  -81.3792365), 2)); // Savannah - Orlando
		double side6 = Math.sqrt(Math.pow((35.2270869 - 28.5383355), 2) + Math.pow((-80.8431267 -  -81.3792365), 2)); // Charlotte - Orlando
		
		double s2 = (side4 + side5 + side6) / 2;
		
		double area2 = Math.sqrt(s2 * (s2 - side4) * (s2 - side5) * (s2 - side6));
		
		double area = area1 + area2;
		
		System.out.printf("The estimated area between the four cities is %.3f" , area);
	}

}
