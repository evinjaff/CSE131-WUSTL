package exercises5;

public class Recipe {

	public static void main(String[] args) {
		
		//
		// No java code needed for this exercise
		// Below, use comments or actual Java code
		//  to type in the abstractions
		//  you found in the recipe story
		// 

		//
		// Use those abstractions in comments or code to 
		//   express the recipe
		//
		// Steps:
		/*
		Heat 200 cc water to 100 degrees
		Stir in 5 grams of yeast
		Melt butter and stir in the vanilla with the butter
		After 5 minutes, combine yeast with butter, sugar, and flour
		Place the mixture in a 110 degree oven to rise for 45 minutes
		Divide the mixture into 10 equally sized portions and cook for 45 minutes at 350 degrees
		
		*/
		
		//Oven.heat(amount, temperature, item);
		//Bowl.stir(item, amount; item, amount);
		//Tray.split(item, divisor);
		//System.delay(time);
		
		
		Oven.heat(200, 100, water);
		
		Oven.out(water);
		
		Bowl.stir(5, yeast; 0, air);
		
		Oven.heat(50, 70, butter); //Eyeballing grams number
		
		Bowl.stir(50, butter; 3, vanilla); //Outputs buttervanilla
		
		System.delay(300000); //300000 ms = 5 minutes
		
		Bowl.stir(53, buttervanilla; 5, yeast); //Outputs buttervanillayeast
		
		Oven.heat(58, 100, buttervanillayeast);
		
		System.delay(2.7e+6); // 2.7e+6 ms = 45 min
		
		Tray.split(buttervanillayeast, 10); 
		
		Oven.heat(58, 450, buttervanillayeast);
		
		System.delay(2.7e+6); // 2.7e+6 ms = 45 min
		
		
		
		
	}

}
