package onerepmax;

import cse131.ArgsProcessor;

public class onerep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		int successfullWeight = ap.nextInt("What is the successfull weight lifted?");
		int successfullReps = ap.nextInt("How many successfull reps?");
		int desiredReps = ap.nextInt("How many reps do you want to do");
		int pctRM = 0;
		
		double oneRep = successfullWeight*(1.0 + ((successfullReps*1.0)/30.0));
		
		System.out.println("One Rep Max: " + oneRep);
		System.out.println("Weight for " + desiredReps + " reps: " );
		
		for(int i= 95;i>=50;i = i -5) {
			pctRM = (int)((i*.01)*oneRep);
			System.out.println(i + "% 1 RM: " + pctRM);
			
		}
			
	}

}
