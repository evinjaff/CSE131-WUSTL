package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;


public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(.5, .25);
		
		// larger green point
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(.05);
		StdDraw.point(.3, .6);
		
		
		// unfilled red triangle
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(.01);
		
		StdDraw.line(.1, .1, .2, .3);
		StdDraw.line(.2, .3, .3, .1);
		StdDraw.line(.3, .1, .1, .1);
		
		
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		
		StdDraw.filledCircle(.8, .7, .1);

		// filled blue rectangle
		double rectx[] = {.4, .4, .7, .7};
		double recty[] = {.4, .6, .6, .4};
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledPolygon(rectx, recty);
		


	}

}
