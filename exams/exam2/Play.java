package exam2;

import sedgewick.StdDraw;

public class Play {
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param hw is half width of the square I must draw
	 */
	public static void sq(double x, double y, double hw) {// x and y are the center of the square
		
		// give up if the width is small
		if (hw < .0005) 
			return;  // avoids executing what's below
		
		// four recursive calls
		// draw that sqaure
		StdDraw.filledRectangle(x, y, hw, hw);
		// upper left
		sq(x-2*hw, y+2*hw, hw/4); // and half as small, upper left
		sq(x+2*hw, y+2*hw, hw/4); // upper right
		sq(x-2*hw, y-2*hw, hw/4); // lower left
		sq(x+2*hw, y-2*hw, hw/4); // lower right
		
	}

	public static void main(String[] args) {
		sq(.5, .5, .20);
	}

}
