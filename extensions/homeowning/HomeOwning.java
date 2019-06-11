package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Enter the name of the apartment complex");
		String zip = ap.nextString("Enter zip code");
		int rent = ap.nextInt("What is the monthly rent?");
		double mortgage = ap.nextDouble("What is the daily interest payment on your mortgage?");
		double mortgageYear = mortgage*365;
		
		// Other factors
		
		boolean rentBuy = rent < mortgage*30.0;
		
		System.out.println(name + "is located in zip code" + zip);
		System.out.println("Rent per year $" + rent*12);
		System.out.println("Rent per month $" + rent);
		System.out.println("\nInterest paid per year $" + mortgageYear);
		System.out.println("Interest paid per month $" + mortgage*30.0);
		if(rentBuy) {
			System.out.println("You should rent");
		}
		else {
			System.out.println("You should buy");
		}
		
		
		

	}

}
