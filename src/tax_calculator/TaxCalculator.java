package tax_calculator;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your average weekly income: ");
		double weeklyIncome = input.nextDouble();

		double taxRate = 0.0;
		double taxesDue = 0.0;

		if (weeklyIncome < 0) {
			System.out.println("Income cannot be negative");
		} else {
			if (weeklyIncome < 500) {
				taxRate = 0.1;
			} else if (weeklyIncome < 1500) {
				taxRate = 0.15;
			} else if (weeklyIncome < 2500) {
				taxRate = 0.2;
			} else {
				taxRate = 0.3;
			}

			taxesDue = weeklyIncome * taxRate;
			System.out.printf("Tax rate: %.0f%%%n", taxRate * 100);
			System.out.printf("Your weekly tax withholding is: $%.2f%n", taxesDue);
		}
		input.close();
	}

}
