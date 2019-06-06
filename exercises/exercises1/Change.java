package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int pennies = ap.nextInt("Enter a number of pennies");
		int dollarBills = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int returnPennies = pennies;
		
		
		
		while (pennies/100 >= 1) {
			pennies = pennies - 100;
			dollarBills++;
		}
		while (pennies/25 > 0) {
			pennies = pennies - 25;
			quarters++;
			
		}
		while (pennies/10 >= 1) {
			pennies = pennies - 10;
			dimes++;
		}
		while (pennies/5 >= 1) {
			pennies = pennies - 5;
			nickels++;
		}
		 
		if(returnPennies == 1) {
		System.out.println(returnPennies + " penny can be converted into");
		}
		else {
			System.out.println(returnPennies + " pennies can be converted into");
		}
		
		if(dollarBills == 1) {
			System.out.println(dollarBills + " dollar");
		}
		else {
			System.out.println(dollarBills + " dollars");
		}
		
		if(quarters == 1) {
		System.out.println(quarters + " quarter");
		}
		else {
			System.out.println(quarters + " quarters");
		}
		if(dimes == 1) {
		System.out.println(dimes + " dime");
		}
		else {
			System.out.println(dimes + " dimes");
		}
		if(nickels == 1) {
		System.out.println(nickels + " nickel");
		}
		else {
			System.out.println(nickels + " nickels");
		}
		if(pennies == 1) {
		System.out.println(pennies + " penny leftover");
		}
		else {
			System.out.println(pennies + " pennies leftover");
		}
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
