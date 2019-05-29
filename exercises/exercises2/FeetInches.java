package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int inchAmt = ap.nextInt("Enter an inch amount"); // Prompt the user for a number of inches
		
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		int footCount = inchAmt/12;
		int inchComp = inchAmt%12;
		
		if (footCount > 0) {
			if(footCount == 1) {
				if (inchAmt == 1) {
					System.out.println(footCount + " foot " + inchComp + " inch"); //Only includes 1 inch, because I don't think 0 inch is proper English
				}
				else {
					System.out.println(footCount + " foot " + inchComp + " inches");
				}
				
			}
			else {
				if (inchAmt == 1){
					System.out.println(footCount + " feet " + inchComp + " inch");
				}
				else {
					System.out.println(footCount + " feet " + inchComp + " inch");
				}
				
			}
			
		}
		else {
			if (inchAmt == 1) {
				System.out.println(inchAmt + " inch");
			}
			else {
				System.out.println(inchAmt + " inches");
			}
			
			
		}
		
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
