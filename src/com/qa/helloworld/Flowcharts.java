package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {

		flowMethod(3, 2, true);
		
	}

	public static void flowMethod(int num1, int num2, boolean bool1) {
		int resultAdd = num1 + num2;
		int resultMult = num1 * num2;

		if (bool1 = true) {
			System.out.println(resultAdd);

		} else {
			System.out.println(resultMult);
		}

	}

}
