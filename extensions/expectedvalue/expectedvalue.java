package expectedvalue;

import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		double p = ap.nextDouble("What is the probability your game startup succeeds \n0 = 0% \n.5 = 50% \n1 = 100%?");
		
		double gamerRoll = Math.random();
		System.out.println(gamerRoll);
		//game startup $190,000 or $5,000
		
		//Programmer $110,000 - $160,000
		
		int programmerMoney = (int)(Math.random()*50000) + 110000;
		int gameMoney = (gamerRoll < p) ? 190000 : 5000; 
		
		
		
		System.out.println("Income from game startup: $" + gameMoney);
		
		boolean gamerProgrammer = gameMoney > programmerMoney;
		
		System.out.println("Income as a programmer: $" + programmerMoney);
		System.out.println("Should you be a game designer based on income? " + gamerProgrammer + "\n");
		
		double gamerEU = 3.0*Math.sqrt(gameMoney*1.0);
		double programmerEU = 2*Math.sqrt(programmerMoney*1.0); 
		boolean euGP = gamerEU > programmerEU;
		
		System.out.println("Gamer EU: " + gamerEU);
		System.out.println("Programmer EU: " + programmerEU);
		System.out.println("Should you be a game designer based on Expected Utility? " + euGP);
		
	}

	private static int sqrt(int programmerMoney) {
		// TODO Auto-generated method stub
		return 0;
	}

}
