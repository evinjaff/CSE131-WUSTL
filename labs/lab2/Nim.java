package lab2;

import cse131.ArgsProcessor;

public class Nim {
	public static void main(String[] args) {
		int i = 1;
		for (int firstStick = (int)(Math.random() * 15 + 1); firstStick > 0; i++) {
			double compPickup = Math.random();
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int rep1   = ap.nextInt("Round " + i + " | Sticks: " + firstStick +  " | Pick up 1 or 2?");
		
		if(rep1 == 1) {
			firstStick--;
			System.out.println("You pick up 1 stick!");
			if (firstStick == 0) {
				System.out.println("You win!");
				System.exit(0);
			}
			if (compPickup > 0.5) {
				if (firstStick == 1) {
					System.out.println("Computer Picks up 1 stick, you lose!");
				}
				else {
				firstStick--;
				System.out.println("Computer Picks up 1 stick");
				}
			}
			else {
				if (firstStick == 1) {
					System.out.println("Computer Picks up 1 stick, you lose!");
				}
				else {
				firstStick = firstStick - 2;
				System.out.println("You pick up 1 stick");
				System.out.println("Computer Picks up 2 sticks");
				if (firstStick == 0) {
					System.out.println("Computer picks up 2 sticks, you lose!");
					}
				}
			}
			
		}
		
		else if(rep1 == 2) {
			firstStick = firstStick - 2;
			System.out.println("You pick up 2 sticks!");
			if (firstStick == 0) {
				System.out.println("You win!");
				System.exit(0);
			}
			if (firstStick == -1) {
				System.out.println("You win, but you couldn't pick up the second stick!");
				System.exit(0);
			}
			if (compPickup > 0.5) {
				if (firstStick == 1) {
					System.out.println("Computer Picks up 1 stick, you lose!");
				}
				else {
				firstStick--;
				System.out.println("Computer Picks up 1 stick");
				}
			}
			else {
				firstStick = firstStick - 2;
				if (firstStick == 1) {
					System.out.println("Computer Picks up 1 stick, you lose!");
				}
				else {
				System.out.println("Computer Picks up 2 sticks");
				}
				
			}
		}
		
	
	System.out.println();
	}
	}
}
