package arrays;
import cse131.ArgsProcessor;

public class Sorting {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("How big do you want the array?");
		int intStore = 0;
		int sortCount = 0;
		int intCount = 1;
		int integers [] = new int [size];
		


		while(sortCount != size) {
			intStore = ap.nextInt("Please provide integer " + intCount);
			integers[sortCount] = intStore;
			//System.out.println(integers[sortCount]);
			intCount++;
			sortCount++;
		}


		sortCount = 0;
		//System.out.println("Ints new");
		//while(sortCount < size) {
		//int j = 0; //jumps up the array size for IntegersNew
		for(int i=0; i<size;i++) { //Runs through all numbers
			for(int k=0;k<size;k++) {

				if(integers[k] > integers[i] ) {
					intStore = integers[i];
					integers[i] = integers[k];
					integers[k] = intStore;
					//System.out.println("$");
				}

			}
		}
		//}

		//Computational Loop
		int sum = 0;
		double mean = 0.0;
		int middleTerm = 0;
		double median = 0.0;

		int placeTest1 = (int)(integers.length/2) - 1;
		int placeTest2 = (int)(integers.length/2);
		int maxPl = integers.length - 1;

		//System.out.println("placeTest1 = " + placeTest1);
		//System.out.println("placeTest2 = " + placeTest2);

		if (integers.length/2.0 != (int)(integers.length/2)) {
			median = integers[placeTest2];
		}
		else {
			//System.out.println("strange number!");
			median = (integers[placeTest2] + integers[placeTest1])/2.0;
		}

		//System.out.println("middle: " + middleTerm);
		for(int i=0;i<integers.length;i++) {
			sum = integers[i] + sum;
			System.out.print(integers[i] + "  ");
		}
		mean = (sum*1.0)/integers.length;
		System.out.println("\nMean = " + mean);

		System.out.println("Median = " + median);

		System.out.println("Min = " + integers[0]);

		System.out.println("Max = " + integers[maxPl]);
		
		System.out.println("Range = " + (integers[maxPl]-integers[0]));
		/*
		sortCount = 0;
		while(sortCount != size) {
			System.out.print(integers[sortCount] + " ");
			System.out.print("Sum = " + sum);
			sortCount++;
		}
		 */



	}

}


