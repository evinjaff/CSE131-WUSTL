package interfacefiddle;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class B implements X {
	public String who ( String v ) {
		return " The Butler " ;
	}
	public int getSentence() {
		return 2
	}
	public double X (double x) {
		System.out.println("x = " + x);
		if(x>10) {
			return x;
		}

		return X(x+3);
	}
	public void plot ( double x ) {
		StdDraw.point (x , x );
	}
	public void show () {
		StdDraw.show (10);
	}
	
	public static void main(String args[]) {
		ArgsProcessor ap = new ArgsProcessor(args);
		double x = ap.nextDouble();
		
		B U = new B();
		
		U.X(1);
	}
	
}
