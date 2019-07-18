package lines;

import sedgewick.StdDraw;

public class Lines {

	/**
	 * 
	 * @param x1 x coordinate of starting point
	 * @param y1 y coordinate of starting point
	 * @param x2 x coordinate of ending point
	 * @param y2 y coordinate of ending point
	 */
	public static void drawLine(double x1, double y1, double x2, double y2) {
		// FIXME -- fill in this method according to the instructions
		
		double x1store = x1;
		
		double x2store = x2;
		
		StdDraw.setPenRadius(.01);
		if(x1 == x2 && y1 == y2) {
			return;
		}
		
		
		
		
		if(x2 == x1 && y2 > y1) {
			StdDraw.point(x1, y1);
			drawLine(x1, y1+.01, x2, y2);
		}
		
		//from .25, .75 to .75, .75
		
		
		
		
		
		/*
		if(y1 == y2 && x1 > x2) {
			StdDraw.point(x1, y1);
			drawLine(x1+.01, y1, x2, y2);
		}
		*/
		
		if(y1 == y2 && x1 < x2) {
			StdDraw.point(x1, y1);
			drawLine(x1+.01, y1, x2, y2);
		}
		if(y1 == y2 && x1 > x2) {
		drawLine2(x1, y1, x2, y2);
		}
		if(y1 > y2 && x1 == x2) {
			drawLine2(x1,x2,y1,y2);
		}
	}
	public static void drawLine2(double x1, double y1, double x2, double y2) {
		if(y1 == y2 && x1 > x2) {
			StdDraw.point(x1, y1);
			drawLine2(x1-.01, y1, x2, y2);
		}
		if(y1 > y2 && x1 == x2) {
			StdDraw.point(x1, y1);
			drawLine2(x1, y1-.01, x2, y2);
		}
	}
	
	
	/**
	 * Code to test the drawLine method visually
	 */
	public static void main(String[] args) {
		
		//
		// Test the drawing program
		//
		drawLine(0,0,1,1); // lower left to upper right
		drawLine(0,1,1,0); // upper left to lower right
		
		//
		// Draw rectangles of decreasing width and height
		//
		for (double r = 0.25; r < 0.5; r = r+.005) {
			double s = 1-r;
			
			drawLine(r,r, r, s); // from .25, .25 to .25, .75
			drawLine(r, s, s, s); //from .25, .75 to .75, .75
			
			drawLine(s, s, s, r); //from .75, .75 to .75, .25
			
			drawLine(s, r, r, r); //from .75, .25 to .25, .25
			
			/*
			StdDraw.line(r,r, r, s);
			StdDraw.line(r, s, s, s);
			StdDraw.line(s, s, s, r);
			StdDraw.line(s, r, r, r);
			*/
		}
		System.out.println("done drawing");
	}

}
