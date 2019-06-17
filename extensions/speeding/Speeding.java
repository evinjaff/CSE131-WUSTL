package speeding;

import cse131.ArgsProcessor;

public class Speeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int carSpeed = ap.nextInt("How fast were you going?");
		int speedLimit = ap.nextInt("What was the speed limit?");
		
		if (carSpeed<speedLimit) {
		int finableAmount = ((carSpeed-(speedLimit+10))*10)+50;
		
		System.out.println("You owe $" + finableAmount);
		}
		else {
			System.out.println("");
		}
	}

}
