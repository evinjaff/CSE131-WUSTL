package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");
		int length = 10000;
		double dataset [] = new double [length];
		double sum = 0.0;
		int min = 0; // catalogs point in the array when the min is
		double minraw = 0.0; 
		int max = 0; //catalogs point in the array when the max is
		double maxraw = 0.0;
		int nn = 1; //increment that needs to be bigger than -1
		int i = 0;
		while (StdIn.isEmpty()==false) {
			
			dataset[i] = StdIn.readDouble();
			if(dataset[i]>maxraw) {
				maxraw = dataset[i];
				max = i;
			}
			double lowcheck = Math.min(dataset[nn] , dataset[nn-1]);
			if(dataset[i] == lowcheck) {
				
				minraw =  dataset[i];
				min = i;
				
			}
			sum = dataset[i] + sum;
			System.out.println(dataset[i]);
			i++;
			nn++;
		}
		
		double avg = sum*1.0/i;
		System.out.println("The sum is: " + sum);
		System.out.println("The average is " + avg);
		System.out.println("The max is " + dataset[max]);
		System.out.println("The min is " + dataset[min]);
		
		
		
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
