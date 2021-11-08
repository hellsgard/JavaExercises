package com.qa.helloworld;

public class StringExercise {

	public static void main(String[] args) {

		String rainStr = " Yesterday it was raining ";
		String sunStr = " Today it is sunny ";

		System.out.println(sunStr.toUpperCase().concat(rainStr.toUpperCase()));

		System.out.println(sunStr.substring(1, 13).concat(rainStr.substring(18, 25)));

	}

}
