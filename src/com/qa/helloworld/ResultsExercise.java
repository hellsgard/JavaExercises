Resultpackage com.qa.helloworld;

public class ResultsExercise {

	public static double physics;
	public static double chemistry;
	public static double biology;
	public static double percentPhysics;
	public static double percentChemistry;
	public static double percentBiology;
	public static double total;
	public static double percentage;

	public static void main(String[] args) {

		examResults(90, 90, 92);
		examPercent();

	}

	public static void examResults(double resultPhysics, double resultChem, double resultBiology) {
		physics = resultPhysics;
		chemistry = resultChem;
		biology = resultBiology;
		total = physics + chemistry + biology;
		percentPhysics = (physics * 100) / 150;
		percentChemistry = (chemistry * 100) / 150;
		percentBiology = (biology * 100) / 150;

		System.out.println("Your Physics grade is " + physics + " which is " + percentPhysics + "%");
		System.out.println("Your Chemistry grade is " + chemistry + " which is " + percentChemistry + "%");
		System.out.println("Your Biology grade is " + biology + " which is " + percentBiology + "%");
		System.out.println("your total grade is " + total);

	}

	public static void examPercent() {
		percentage = (total * 100) / 450;

		System.out.println("Your total percentage is " + percentage + "%");

		if (percentage >= 60 && percentPhysics >= 60 && percentChemistry >= 60 && percentBiology >= 60) {
			System.out.println("CONGRATULATIONS YOU PASSED!");
		} else {
			System.out.println("YOU FAILED LOSER");
		}
	}

}
