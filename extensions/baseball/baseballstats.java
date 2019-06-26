package baseball;

import cse131.ArgsProcessor;

public class baseballstats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Enter player's name");
		int atBats = ap.nextInt("Enter number of at-bats");
		int hits = ap.nextInt("Enter number of hits");
		
		double battingAverage = (hits*1.0)/(atBats*1.0);
		
		boolean allStar = battingAverage >= 0.270 && atBats > 200;
		
		System.out.println("Player: " + name + "\nBatting Average: " + battingAverage);
		System.out.println("All-Star Worthy? " + allStar);
		
		
	}

}
