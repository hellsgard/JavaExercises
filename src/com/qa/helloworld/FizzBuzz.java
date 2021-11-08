package com.qa.helloworld;

public class FizzBuzz {

	public static void main(String[] args) {

		fizzBuzz(6);

	}

	public static void fizzBuzz(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			System.out.println("FizzBuzz!");
		} else if (number % 5 == 0 && number % 3 > 0) {
			System.out.println("Buzz!");
		} else if (number % 5 > 0 && number % 3 == 0) {
			System.out.println("Fizz!");
		} else {
			System.out.println(number);
		}
	}

}
