package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int whatPitch = ap.nextInt("What pitch?");
		
		double hertzOrig = 440.0 * Math.pow(2.0, whatPitch/12.0);
		
		double hertzSeven = 440.0 * Math.pow(2.0, (whatPitch+7.0)/12.0);
		
		double hertzRatio = hertzSeven/hertzOrig;
		
		System.out.println("For pitch " + whatPitch + " we get:");
		System.out.println("Frequency of the pitch: " + hertzOrig);
		System.out.println("Frequency of the pitch up 7 chromatic scales: " + hertzSeven);
		System.out.println("The ratio of the two pitches is " + hertzRatio);
		
	}

}
