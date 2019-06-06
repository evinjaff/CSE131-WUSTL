package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Enter food name");
		double carbs = ap.nextDouble("Enter amount of carbs in grams");
		double fat = ap.nextDouble("Enter amount of fat in grams");
		double protein = ap.nextDouble("Enter amount of protein in grams");
		int statedCals = ap.nextInt("Enter amount of calories");
		double fiber = -(statedCals-((carbs*4)+(fat*9)+(protein*4)));
		
		double proteinRound = (Math.round(protein*10))/10;
		double fiberRound = (Math.round(fiber*10))/10;
		double carbRound = (Math.round(carbs*10)/10);
		double fatRound = (Math.round(fat*10)/10);
		
		double carbCalories = ((carbs*4)/statedCals)*100;
		
		double fatPercent = Math.round(((((fat*9)/statedCals)*1000)));
		double proteinPercent = Math.round((protein*4)/statedCals*100);
		double fiberPercent = Math.round((fiberRound)/statedCals*100);
		double carbPercent = (Math.round(carbCalories*10));
		double carbRounded = carbPercent/10;
		double proteinRounded = proteinPercent/10;
		double fatRounded = fatPercent/10;
		double fiberRounded = fiberPercent/10;
		
		boolean lowCarb = carbPercent < 0.25;
		boolean lowFat = fatPercent < 0.15;
		boolean coinFlip = Math.random() > 0.5;
		
		
		
		System.out.println(name + " has:");
		System.out.println("\t" + carbs + " grams of carbs = " + carbRound*4 + " calories");
		System.out.println("\t" + fat + " grams of fat = " + fatRound*9 + " calories");
		System.out.println("\t" + protein + " grams of protein = " + proteinRound*4 + " calories");
		System.out.println("This food has " + (statedCals-fiberRound) + " available calories");
		System.out.println("With " + fiberRound + " unavailable calories, this food has " + fiberRound/4 + " grams of fiber");
		System.out.println("");
		System.out.println("This means:");
		System.out.println("\t" + carbRounded + "% of the caloriess in the food are carbohydrates");
		System.out.println("\t" + fatRounded+ "% of the calories in the food are fats");
		System.out.println("\t" + proteinRounded + "% of the calories in the food is protein");
		System.out.println("\t" + fiberRounded + "% of the calories in the food are fiber");
		System.out.println("");
		System.out.println("Is this food acceptable for a low-carb diet? " + lowCarb);
		System.out.println("is this food acceptable for a low-fat diet? " + lowFat);
		System.out.println("By a coin flip, should you eat this food? " + coinFlip);
		
	}

}
