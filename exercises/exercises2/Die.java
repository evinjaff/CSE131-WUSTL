package exercises2;

public class Die {

	public static void main(String[] args) {

		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//
		// My solution was different than the professors, since he increments by less than, which is a little more efficient while I work with the idea of ranges. Regardless, I tested outputs and it seems to function like a normal dice
		double output = Math.random();
		if (output < 1.0/6.0) {
			System.out.println("1");
		}
		if (output > 5.0/6.0) {
			System.out.println("6");
		}
		if (output > 1.0/6.0) {
			if (output < 2.0/6.0) {
				System.out.println("2");
			}
		}
		if (output > 2.0/6.0) {
			if (output < 3.0/6.0) {
				System.out.println("3");
			}
		}
		if (output > 3.0/6.0) {
			if (output < 4.0/6.0) {
				System.out.println("4");
			}
		}
		if (output > 4.0/6.0) {
			if (output < 5.0/6.0) {
				System.out.println("5");
			}
		}
	}

}
