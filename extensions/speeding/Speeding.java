package speeding;

import cse131.ArgsProcessor;

public class Speeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int carSpeed = ap.nextInt("How fast were you going?");
		int speedLimit = ap.nextInt("What was the speed limit?");
		
		
		int finableAmount = (carSpeed < speedLimit+10) ? 0 : (((carSpeed-(speedLimit)-10))*10)+50;
		//int finableAmount = ((carSpeed-(speedLimit+10))*10)+50;
		
		System.out.println("You went " + carSpeed + "MPH in a " + speedLimit + "MPH zone");
		System.out.println("That means you went " + (carSpeed-(speedLimit)) + " MPH over the speed limit.");
		System.out.println("Your fine is $" + finableAmount);
		
		
	}

}
