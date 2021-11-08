package com.qa.helloworld;

public class ArrayExercise {

	public static void main(String[] args) {

		int[] myArray = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println(myArray[i] = i + 1);
			for (int j = 0; j < myArray.length; j++) {
				if (myArray[j] == i + 1) {
					System.out.println((i + 1) * 10);
				}

			}
		}

	}

}
