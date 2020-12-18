package chapter04;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		double workHours = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate: ");
		double federalWitholdingRate = input.nextDouble();

		System.out.print("Enter state tax withholding rate: ");
		double stateWitholdingRate = input.nextDouble();

		double grossPay = hourlyPayRate * workHours;
		double federalWitholding = grossPay * federalWitholdingRate;
		double stateWitholding = grossPay * stateWitholdingRate;
		double totalDeduction = federalWitholding + stateWitholding;

		System.out.println("Employee name: " + name);
		System.out.println("Hours Worked: " + workHours);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out
				.println("\t Federal Withholding " + "(" + (federalWitholdingRate * 100) + "%): $" + federalWitholding);
		System.out.println("\t State Withholding " + "(" + (stateWitholdingRate * 100) + "%): $" + stateWitholding);
		System.out.println("\t Total Deduction: $" + totalDeduction);
		System.out.println("Net Pay: $" + (grossPay - totalDeduction));
	}

}
