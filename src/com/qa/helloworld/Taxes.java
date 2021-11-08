package com.qa.helloworld;

public class Taxes {

	public static void main(String[] args) {

		whatTaxBand(25000);
		totalTax(25000);

	}

	public static void whatTaxBand(double salary) {
		if (salary >= 0 && salary <= 14999) {
			System.out.println("0% tax");
		} else if (salary >= 15000 && salary <= 19999) {
			System.out.println("10% tax");
		} else if (salary >= 20000 && salary <= 29999) {
			System.out.println("15% tax");
		} else if (salary >= 30000 && salary <= 44999) {
			System.out.println("20% tax");
		} else if (salary >= 45000) {
			System.out.println("25% tax");

	}

}

public static void totalTax(double salary) {
	if (salary >= 0 && salary <= 14999) {
		System.out.println(0);
	} else if (salary >= 15000 && salary <= 19999) {
		System.out.println("your total tax is " + 0.10 * salary);
	} else if (salary >= 20000 && salary <= 29999) {
		System.out.println("your total tax is " + 0.15 * salary);
	} else if (salary >= 30000 && salary <= 44999) {
		System.out.println("your total tax is " + 0.20 * salary);
	} else if (salary >= 45000) {
		System.out.println("your total tax is " + 0.25 * salary);

	}
}
}