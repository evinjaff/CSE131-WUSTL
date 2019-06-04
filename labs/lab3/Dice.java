package lab3;
import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int diceQuant = ap.nextInt("Enter how many dice you want to roll");
		int diceRolls = ap.nextInt("Enter how many times you want to roll the dice");
		int sumRow = 0;

		int output[][] = new int [diceQuant+ 10][diceRolls+ 10];

		int origSum[][] = new int [2][6*diceQuant*diceRolls];
		
		for(int i = )


		for(int i = 0; i < diceQuant; i++) {

			output[0][i] = i+1;
			if (output[0][i] > 9) {
				System.out.print(output[0][i] + " ");
			}
			else {
				System.out.print(output[0][i] + "  ");
			}
		}
		System.out.println("");
		for(int i = 0; i < diceQuant; i++) {
			System.out.print("---");
		}
		for(int rw=0;rw<diceRolls;rw++) {
			sumRow = 0;
			System.out.println("");


			for(int col=0;col<diceQuant;col++) {

				// End of getting dice value

				output[rw][col] = (int) (Math.random()*6) + 1;
				if(output[rw][col] > 9) {
					System.out.print(output[rw][col] + " ");
				}
				else {
					System.out.print(output[rw][col] + "  ");
				}
				sumRow = output[rw][col] + sumRow;
				
			}
			origSum[0][rw] = sumRow;

			System.out.println("");
			System.out.println(sumRow);
			System.out.println("");
			System.out.println(origSum[0][rw]);
			System.out.println("");
			
			if

		}
		int sums[][] = new int [1000][2];
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