package com.qa.helloworld;

public class EnhancedLoopExercise {

	public static void main(String[] args) {


//		String[] animals = { "tiger", "bear", "sheep", "dog", "duck", "elephant" };
//		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//
//		for (String name : animals) {
//			System.out.println(name);
//		}
//


		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i : numberArray) {
			if (evenTest(i)) {
				System.out.println("even " + i * i * i);
			} else {
				System.out.println("odd " + i * i);

			}
		}

	}

	public static boolean evenTest(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;


				}

			}



		}




