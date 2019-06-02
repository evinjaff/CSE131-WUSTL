package studio2;

import cse131.ArgsProcessor;

public class Gamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int money = ap.nextInt("Enter Starting Money");
		int winAmt = ap.nextInt("Enter how much you want to win");
		double winChance = ap.nextDouble("Enter the win chance");
		int plays = ap.nextInt("Enter how many times you want to play");
		int totalLoss = 0;
		double wlratio = 0.0;

		for (int i = 0; i < plays; i++) {
			int moneyStore = money;
			while (money != 0 && money < winAmt) { // since number of loops is not known
				 double win = Math.random();
				 if (win < winChance) {
					 money++;
					 
				 }
				 else {
					 money--;
				 }
				 if(money == 0) {
					 totalLoss++;
				 }
				 System.out.println(money);
			}
			money = moneyStore;
			wlratio = totalLoss/plays;
			
			
			//Eventual if statement
		}
		System.out.println("Chance of going bankrupt: " + wlratio);
	}

}
