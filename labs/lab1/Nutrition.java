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
		
		double fatPercent = ((fat*9)/statedCals);
		double fiber = (statedCals)-((carbs*4)+(fat*9)+(protein*4));
		double proteinPercent = (((protein*4)/statedCals)*100);
		double fiberPercent = ((fiber/statedCals)*100);
		double carbPercent = ((carbs*4)/statedCals);
		
		boolean lowCarb = carbPercent < 0.25;
		boolean lowFat = fatPercent < 0.15;
		boolean coinFlip = Math.random() > 0.5;
		
		
		System.out.println(name + " has:");
		System.out.println(carbs + " grams of carbs = " + carbs*4 + " calories");
		System.out.println(fat + " grams of fat = " + fat*9 + " calories");
		System.out.println(protein + " grams of protein = " + protein*4 + " calories");
		System.out.println("This food has " + (statedCals-fiber) + " available calories");
		System.out.println("With " + fiber + " unavailable calories, this food has " + fiber/4 + " grams of fiber");
		System.out.println("");
		System.out.println("This means:");
		System.out.println(carbPercent*100 + "% of the caloriess in the food are carbohydrates");
		System.out.println(fatPercent*100 + "% of the calories in the food are fats");
		System.out.println(proteinPercent + "% of the calories in the food is protein");
		System.out.println(fiberPercent + "% of the calories in the food are fiber");
		System.out.println("Is this food acceptable for a low-carb diet? " + lowCarb);
		System.out.println("is this food acceptable for a low-fat diet? " + lowFat);
		System.out.println("By a coin flip, should you eat this food? " + coinFlip);
		
	}

}
