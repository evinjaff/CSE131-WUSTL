package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		N++;
		
		int[][] mult = new int[N+1][N+1];
		
		for(int row = 0; row < N + 1; row++) {
			for(int column = 0; column < N + 1; column++) {
				mult[row][column] = row * column;
		}
		}
		System.out.println("    ");
		
		for(int i = 0; i < N;i++) {
			if (mult[1][i] == 0) {
				System.out.print("    " + mult[1][i] + "  ");
			}
			else if (mult[1][i] > 0) {
			System.out.print(mult[1][i] + "  ");
			}
			}
		System.out.println("       ");
		for(int i = 0; i < N;i++) {
		System.out.print("----");
		}
		System.out.println("      ");
		
		
		for(int col = 0; col < N;col++) {
			System.out.print(col + " | ");
				for(int rw = 0; rw < N;rw++) {
					
					if(mult[col][rw] > 9){
						System.out.print(mult[col][rw] + " ");
					}
					else {
						System.out.print(mult[col][rw] + "  ");
					}
					
				}
				System.out.println("");
			}
		
		
		//  Table should include rows and columns for 0...N  
		//     mkaing N+1 rows and columns
		
	}

}
