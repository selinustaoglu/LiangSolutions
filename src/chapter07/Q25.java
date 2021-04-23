package chapter07;

public class Q25 {

	public static void main(String[] args) {
		System.out.println("Enter a,b,c values of an equation: ");
		
		double[] eqn = Chapter7Util.scanDoubleArray(3);
		
		solveQuadratic(eqn);
	}
	
	public static void solveQuadratic(double[] eqn) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		double discriminant = Math.pow(b, 2) - (4*a*c);
		
		if(discriminant > 0) {
			System.out.println("There are two real roots.");
			double r1 = (-b + Math.sqrt(discriminant)) / 2 * a;
			double r2 = (-b - Math.sqrt(discriminant)) / 2 * a;
			System.out.println("The two roots are "+r1+" and "+r2);
		}else if(discriminant == 0) {
			System.out.println("There is one real root.");
			double r = -b / 2 * a;
			System.out.println("The root is "+r);
		}else
			System.out.println("There are no real roots.");
		
		
	}

}
