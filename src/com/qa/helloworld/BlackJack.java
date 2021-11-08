package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {

		blackjackHand(22, 23);

	}

	public static void blackjackHand(int hand1, int hand2) {
		if (hand1 <= 21 && hand2 > 21) {
			System.out.println(hand1);
		} else if (hand2 <= 21 && hand1 > 21) {
			System.out.println(hand2);
		} else if (hand1 > hand2 && hand1 <= 21) {
			System.out.println(hand1);
		} else if (hand2 > hand1 && hand2 <= 21) {
			System.out.println(hand2);

		} else {
			System.out.println("both hands bust");
		}

	}

}
