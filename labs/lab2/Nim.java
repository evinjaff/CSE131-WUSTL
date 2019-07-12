package lab2;

import cse131.ArgsProcessor;

public class Nim {

	//Nim has been simplified using methods that prevent repetitive print statements
	
	//Reduces code by ~ 20 lines and also removes redundant if statements

	public static String info(int i, int firstStick, int command) {
		if(command == 1) {
			return "Round " + i + " | Sticks: " + firstStick +  " | Pick up 1 or 2?";
		}
		if(command == 2) {
			return "Round " + i;
		}
		return "";
	}

	public static void end(int n) {
		if(n == 0) {
			System.out.println("You win!");
			System.exit(0);
			return;
		}
		if(n == 1) {
			System.out.println("You lose!");
			System.exit(0);
			return;
		}

	}
	public static void action(int n) {
		if (n <= 0) {
			System.out.println("You pick up 1 stick!");
			return;
		}
		if (n == 1) {
			System.out.println("You pick up 2 sticks!");
			return ;
		}
		if (n == 2) {
			System.out.println("CPU picks up 1 stick!");
			return;
		}
		if (n == 3) {
			System.out.println("CPU picks up 2 sticks!");
			return;
		}
		else {
			System.out.println("Error 1: select an action between 0 and 3");
			return;
		}
	}

	public static void game(String[] args) {
		int i = 1;
		for (int firstStick = (int)(Math.random() * 15 + 1); firstStick > 0; i++) {
			double compPickup = Math.random();
			ArgsProcessor ap = new ArgsProcessor(args);
			int rep1   = ap.nextInt(info(i, firstStick, 1));
			System.out.println(info(i, 1, 2));
			if(rep1 == 1) {
				action(0);
				firstStick--;
				if (firstStick == 0) {
					end(0);
					System.exit(0);
				}
				if (compPickup > 0.5) {
					if (firstStick == 1) {
						firstStick--;
						action(2);
						end(1);}
					else {
						firstStick--;
						action(2);}
				}
				else {
					if (firstStick == 1) {
						action(2);
						end(1);
					}
					else {
						firstStick = firstStick - 2;

						if (firstStick == 0) {
							action(3);
							end(1);
						}
						else {
							action(3);
						}
					}
				}
			}
			else if(rep1 == 2) {
				firstStick = firstStick - 2;
				action(1);
				if (firstStick == -1) {
					end(0);
				}
				if (firstStick == 0) {
					end(0);

				}

				if (compPickup > 0.5) { // comp picks up 2
					if (firstStick == 1) {
						firstStick = firstStick - 2;
						action(3);
						end(1);
					}
					if(firstStick == 2) {
						firstStick = firstStick - 2;
						action(3);
						end(1);
					}
					else {
						firstStick = firstStick - 2;
						action(3);
					}
				}
				else {
					if (firstStick == 1) {
						firstStick--;
						action(2);
						end(1);
					}
					else {
						action(2);
					}

				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		game(args);
	}
}
