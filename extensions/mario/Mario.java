package mario;

import cse131.ArgsProcessor;

public class Mario {

	public static void main(String[] args) {

		//
		// Surprise!  This part is done for you.
		//    Don't change this and don't ask for any other inputs
		//      or testing will fail
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int size    = ap.nextInt("What size mountain do you want?");
		int pattern = ap.nextInt("What pattern (1, 2, 3, or 4)?");

		if (size < 1)
			throw new IllegalArgumentException("Size must be at least 1");
		if (pattern < 1 || pattern > 4)
			throw new IllegalArgumentException("Invalid pattern, must be 1, 2, 3, or 4.  Mario aborts");

		//
		// Create the mountain by printing to System.out
		//
		if(pattern == 1) {
			for(int row=0;row<size;row++) {
				for(int col=size-1;col>row;col--) {
					System.out.print(" ");
				}
				for(int platformCt=-1;platformCt<row;platformCt++) {
					System.out.print("#");
				}
				//System.out.print("#");
				System.out.println("");
			}

		}
		
		if(pattern == 2) {
			for(int i=0;i<size+1;i++) {
				for(int k=-1;k<i;k++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			
		}
		
		if(pattern == 3) {
			for(int i=0;i<size;i++) {
				for(int j=0; j<i;j++) {
					//creates needed spaces
					System.out.print(" ");
				}
				
				
				for(int k=size; k>i ;k--) {
					//runs inverse to the i for loop to create the #'s
					System.out.print("#");
				}
				System.out.println("");
			}

		}
		
		if(pattern == 4) {
			for(int i=0;i<=size;i++) { 
				
				for(int k=size;k>i;k--) {
					System.out.print("#");
					//Does all the spaces
				}
				System.out.println("");
			}

		}

	}

}
