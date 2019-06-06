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
		
		
		double proteinRound = (Math.round(protein*40))/10.0;
		double fiberRound = (Math.round(fiber*10))/10.0;
		double carbRound = (Math.round(carbs*40)/10.0);
		double fatRound = (Math.round(fat*90)/10.0);
		
		double carbCalories = ((carbs*4)/statedCals)*100.0;
		
		double fatPercent = Math.round((fatRound/(double)statedCals)*1000.0)/10.0;
		double proteinPercent = Math.round((proteinRound/(double)statedCals)*1000.0)/10.0;
		double fiberPercent = Math.round((fatRound/(double)statedCals)*1000.0)/10.0;
		double carbPercent = Math.round((carbRound/(double)statedCals)*1000.0)/10.0;
		
		boolean lowCarb = carbPercent < 0.25;
		boolean lowFat = fatPercent < 0.15;
		boolean coinFlip = Math.random() > 0.5;
		
		
		
		System.out.println(name + " has:");
		System.out.println("\t" + carbs + " grams of carbs = " + carbRound + " calories");
		System.out.println("\t" + fat + " grams of fat = " + fatRound + " calories");
		System.out.println("\t" + protein + " grams of protein = " + proteinRound + " calories \n");
		System.out.println("This food has " + statedCals + " available calories");
		System.out.println("With " + fiberRound + " unavailable calories, this food has " + fiberRound/4.0 + " grams of fiber");
		System.out.println("");
		System.out.println("This means:");
		System.out.println("\t" + carbPercent + "% of the calories in the food are carbohydrates");
		System.out.println("\t" + fatPercent + "% of the calories in the food are fats");
		System.out.println("\t" + proteinPercent + "% of the calories in the food is protein");
		System.out.println("");
		System.out.println("Is this food acceptable for a low-carb diet? " + lowCarb);
		System.out.println("is this food acceptable for a low-fat diet? " + lowFat);
		System.out.println("By a coin flip, should you eat this food? " + coinFlip);
		
	}

}
