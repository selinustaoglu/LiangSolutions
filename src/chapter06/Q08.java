package chapter06;

public class Q08 {

	public static double celsiusToFahrenheit(int celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double fahrenheitToCelsius(int fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
	
	public static void main(String[] args) {
		//Test
		System.out.println(celsiusToFahrenheit(30));
		System.out.println(fahrenheitToCelsius(86));
	}

}
