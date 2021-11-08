package iteration;

public class Coins {

	public static void main(String[] args) {

		coinChange(20, 2.98);

	}

	public static void coinChange(double note, double cost) {
		double change = note - cost;

		int twentyPound = 0;
		int tenPound = 0;
		int fivePound = 0;
		int twoPound = 0;
		int onePound = 0;
		int fiftyP = 0;
		int twentyP = 0;
		int tenP = 0;
		int fiveP = 0;
		int twoP = 0;
		int oneP = 0;

		while (change > 0.009) {
			if (change >= 20) {
				change -= 20;
				twentyPound++;
			} else if (change >= 10) {
				change -= 10;
				tenPound++;
			} else if (change >= 5) {
				change -= 5;
				fivePound++;
			} else if (change >= 2) {
				change -= 2;
				twoPound++;
			} else if (change >= 1) {
				change -= 1;
				onePound++;
			} else if (change >= 0.50) {
				change -= 0.50;
				fiftyP++;
			} else if (change >= 0.20) {
				change -= 0.20;
				twentyP++;
			} else if (change >= 0.10) {
				change -= 0.10;
				tenP++;
			} else if (change >= 0.05) {
				change -= 0.05;
				fiveP++;
			} else if (change >= 0.02) {
				change -= 0.02;
				twoP++;
			} else if (change >= 0.009) {
				change -= 0.01;
				oneP++;

			}

			}
			System.out.println(twentyPound + ": £20 notes");
			System.out.println(tenPound + ": £10 notes");
			System.out.println(fivePound + ": £5 notes");
			System.out.println(twoPound + ": £2 coins");
			System.out.println(onePound + ": £1 coins");
			System.out.println(fiftyP + ": 50p coins");
			System.out.println(twentyP + ": 20p coins");
			System.out.println(tenP + ": 10p coins");
			System.out.println(fiveP + ": 5p coins");
			System.out.println(twoP + ": 2p coins");
			System.out.println(oneP + ": 1p coins");


			}





	// jenny solution

	public static void change(double cost, double amount) {

		double change = amount - cost;
		int amount10note = 0;
		int amount5note = 0;
		int amount1coin = 0;
		int amount50p = 0;
		int amount20p = 0;
		int amount10p = 0;
		int amount5p = 0;
		int amount2p = 0;
		int amount1p = 0;

		while (change >= 10) {
			change -= 10;
			amount10note++;
		}
		while (change >= 5) {
			change -= 5;
			amount5note++;
		}
		while (change >= 1) {
			change -= 1;
			amount1coin++;
		}
		while (change >= 0.5) {
			change -= 0.5;
			amount50p++;
		}
		while (change >= 0.2) {
			change -= 0.2;
			amount20p++;
		}
		while (change >= 0.1) {
			change -= 0.1;
			amount10p++;
		}
		while (change >= 0.05) {
			change -= 0.05;
			amount5p++;
		}
		while (change >= 0.02) {
			change -= 0.02;
			amount2p++;
		}
		while (change >= 0.01) {
			change -= 0.01;
			amount1p++;
		}

		System.out.println("Your change is:");
		if (amount10note > 1) {
			System.out.println(amount10note + " £10 notes");
		} else if (amount10note == 1) {
			System.out.println(amount10note + " £10 note");
		}
		if (amount5note > 1) {
			System.out.println(amount5note + " £5 notes");
		} else if (amount5note == 1) {
			System.out.println(amount5note + " £5 note");
		}
		if (amount1coin > 1) {
			System.out.println(amount1coin + " £1 coins");
		} else if (amount1coin == 1) {
			System.out.println(amount1coin + " £1 coin");
		}
		if (amount50p > 1) {
			System.out.println(amount50p + " 50p coins");
		} else if (amount50p == 1) {
			System.out.println(amount50p + " 50p coin");
		}
		if (amount20p > 1) {
			System.out.println(amount20p + " 20p coins");
		} else if (amount20p == 1) {
			System.out.println(amount20p + " 20p coin");
		}
		if (amount10p > 1) {
			System.out.println(amount10p + " 10p coins");
		} else if (amount10p == 1) {
			System.out.println(amount10p + " 10p coin");
		}
		if (amount5p > 1) {
			System.out.println(amount5p + " 5p coins");
		} else if (amount5p == 1) {
			System.out.println(amount5p + " 5p coin");
		}
		if (amount2p > 1) {
			System.out.println(amount2p + " 2p coins");
		} else if (amount2p == 1) {
			System.out.println(amount2p + " 2p coin");
		}
		if (amount1p > 1) {
			System.out.println(amount1p + " 1p coins");
		} else if (amount1p == 1) {
			System.out.println(amount1p + " 1p coin");
		}

	}
}
