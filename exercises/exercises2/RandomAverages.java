package exercises2;

import cse131.ArgsProcessor;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int cycleNum   = ap.nextInt("Enter number of cycles");
		double sumNum = 0.0;
		
		for(int gen = 1; gen < cycleNum; gen = gen + 1) {
			sumNum = sumNum + Math.random();
			
			double compAverage = sumNum/gen;
			
			if ((gen-1)%100 == 0) {
				System.out.println(compAverage);
			}
			
			
		}
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses? 
		//It progresses closer to .5
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		//Yes, I can, and I did it by nesting an if statement that counts the generation number, and then prints
		//
		
	}

}
