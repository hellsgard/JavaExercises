package iteration;

public class Flowchartiteration2 {

	public static void main(String[] args) {

		flowCounter();

	}

	public static void flowEvenOdd() {

		for (int A = 100; A < 200; A++) {

			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void flowCounter() {
		for (int num = 1; num <= 10; num++) {

			for (int num2 = num; num2 >= 1; num2--) {
				System.out.println(num);
			}

		}
	}

}

