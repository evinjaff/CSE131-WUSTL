package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Enter your name"); // Name
		double cat1 = ap.nextDouble("Enter Average Exam Score"); // Category 1: Exams (30%)
		double cat2 = ap.nextDouble("Enter Average Labs Score"); // Category 2: Labs (25%)
		double cat3 = ap.nextDouble("Enter Average Studio Score"); // Category 3: Studios (8%)
		double cat4 = ap.nextDouble("Enter Average Extension 1 Score"); // Category 4: Extension 1 (9%)
		double cat5 = ap.nextDouble("Enter Average Extension 2 Score"); // Category 5: Extension 2 (9%)
		double cat6 = ap.nextDouble("Enter Average Extension 3 Score"); // Category 6: Extension 3 (6%)
		double cat7 = ap.nextDouble("Enter Average Project Score"); // Category 7: Project (6%)
		double cat8 = ap.nextDouble("Enter Average Quizzes Score"); // Category 8: Quizzes (2%)
		double cat9 = ap.nextDouble("Enter Average Exercises Score"); // Category 9: Exercises (2%)
		double cat10 = ap.nextDouble("Enter Average Pre-studio synthesis Score"); // Category 10: Pre-stud eval. (2%)
		double cat11 = ap.nextDouble("Enter Average Course Evaluation Score"); // Category 11: Course eval. (1%)

		double score = cat1*.3 + cat2*.25 + cat3*.08 + cat4*.09 + cat5*.09 + cat6*.06 + cat7*.06 + cat8*.02 + cat9*.02 + cat10*.02 + cat11*.01;
		int lettercheck = (int) score - (((int) score/10) * 10);
		int tensdigit = (int) (score/10);
		
		int intgrade = (int) score;
		
		if (tensdigit == 8 || tensdigit == 7) {
		
		boolean plusign = lettercheck > 7 && tensdigit > 6;
		boolean minussign = lettercheck < 3 && tensdigit > 6;
		}
		else
		{
			boolean plusign = false;
			boolean minussign = false;
		
		System.out.println(name + ":");
		System.out.println("Total Score: " + score);
		System.out.println("Grade for this course: " + intgrade);
		System.out.println("Final grade has a...");
		System.out.println("Plus sign: " + plusign);
		System.out.println("Minus sign: " + minussign);
		}
	}

}
