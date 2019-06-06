package lab3;
import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int diceQuant = ap.nextInt("Enter how many dice you want to roll");
		int diceRolls = ap.nextInt("Enter how many times you want to roll the dice");
		int sides = 6; //will eventually be an args variable
		
		int output[][] = new int [diceRolls+2][diceQuant+1];

		int sums[] = new int[diceRolls]; //Array that stores the sums of all rows

		int outcomes[][] = new int[(sides*diceQuant)+9][3]; //2d array that's a table of all the possible outcomes of a dice throw 3 is a constant since there is no variable aspect to how it's stored


/*
		for(int i = 0; i < diceQuant; i++) { // Creates header

			output[i][0] = i+1;
			if (output[i][0] > 9) {
				System.out.print(output[i][0] + " ");
			}
			else {
				System.out.print(output[i][0] + "  ");
			}
		}
		System.out.println("");
		for(int i = 0; i < diceQuant; i++) { // creates line break for header
			System.out.print("---");
		} 
		*/

		int rowSum = 0; //int that grabs the sum of all the outputs
		for(int rw=0;rw<diceRolls;rw++) { //for loop that executes every row
			rowSum=0;
			//System.out.println("");
			
			for(int col=0;col<diceQuant;col++) {//executes every column
			
				// End of getting dice value

				output[rw][col] = (int) (Math.random()*sides) + 1;

				rowSum = output[rw][col] + rowSum;

				//System.out.print(output[rw][col] + "  ");
				/*
				if(output[rw][col] > 9) {
					System.out.print(output[rw][col] + " ");
				}
				else {
					System.out.print(output[rw][col] + "  ");
				}
				 */

				if(col==diceQuant-1) {
					output[rw][col+1] = rowSum;
					//System.out.println(" |> " + output[rw][col+1] + "  <| ");
					sums[rw] = rowSum; 
				}

			}

		}
		System.out.println("\nSum \tAmount of times it appeared \tPercentage of times it appeared ");
		double numSum = 0;
		//for loop that creates array of all possible sums
		for(int i=diceQuant+1;i<6*diceQuant+1;i++) { //6 could be replaced with the number of sides. The i<6*diceQuant statement is trying to get the for loop to store every possible average outcome without going over
			
			outcomes[i][0] = i;
			double sumFrequency = 0.0; //[] = new double [500];


			for(int a=0;a<sums.length;a++) { //This will add +1 to the columns if any duplicates are there
				if(sums[a] == outcomes[i][0]){
					outcomes[i][1]++;
					numSum = sums.length/1.0;
				}
				

			}
			
			sumFrequency = Math.round((outcomes[i][1]/numSum)*1000.0)/10.0;
			
			if(outcomes[i][1] != 0) {
				
				System.out.print(outcomes[i][0]);
				System.out.print("\t" + outcomes[i][1] + "\t \t \t \t" + sumFrequency + "% \n");
			}
		} 


		// Checking for loop for duplicates

	}


}



/*
double roll = Math.random(); //This section Generates die number
int result = 0;
if (roll < 1.0/6.0) {
	result = 1;
}
if (roll > 5.0/6.0) {
	result = 6;
}
if (roll > 1.0/6.0) {
	if (roll < 2.0/6.0) {
		result = 2;
	}
}
if (roll > 2.0/6.0) {
	if (roll < 3.0/6.0) {
		result = 3;
	}
}
if (roll > 3.0/6.0) {
	if (roll < 4.0/6.0) {
		result = 4;
	}
}
if (roll > 4.0/6.0) {
	if (roll < 5.0/6.0) {
		result = 5;
	}
}
 */