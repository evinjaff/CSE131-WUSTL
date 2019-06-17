package rockpaperscissors;

import cse131.ArgsProcessor;

public class rpsgame {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int exit = 0;
		int wins = 0;
		int rounds = 0;
		while(exit == 0) {
			int p1Throw = ap.nextInt("Rock Paper Scissors!\n1 = rock \n2 = paper \n3 = scissors \nType 4 to exit \n" + rounds + " rounds played\nWins: " + wins);

			int cpuThrow = (int) (1+Math.random()*3);
			//System.out.println(cpuThrow + " <CPU");
			//System.out.println(p1Throw + " <Player");
			// 1 = rock ; 2 = paper ; 3 = scissors

			if(cpuThrow == 1) {
				if(p1Throw == 1) {
					System.out.println("Two rocks - redo");

				}

				if(p1Throw == 2) {
					System.out.println("Paper covers rock - You win!");
					wins++;

				}

				if(p1Throw == 3) {
					System.out.println("Rock crushes scissors - You lose!");
				}
			}
			if(cpuThrow == 2) {
				if(p1Throw == 1) {
					System.out.println("Paper covers rock - You lose!");

				}

				if(p1Throw == 2) {
					System.out.println("Two papers - Stalemate!");

				}

				if(p1Throw == 3) {
					System.out.println("Scissors cuts paper - You win!");
					wins++;
				}
			}
			if(cpuThrow == 3) {
				if(p1Throw == 1) {
					System.out.println("Rock Crushes Scissors - You win!");
					wins++;

				}

				if(p1Throw == 2) {
					System.out.println("Scissors cuts paper - You lose!");

				}

				if(p1Throw == 3) {
					System.out.println("Two scissors - Stalemate!");
				}
			}


			if(p1Throw == 4) {
				exit++;
			}






			rounds++;
		}
	}
}
