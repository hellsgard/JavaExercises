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





	
