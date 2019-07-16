package emote;

import java.awt.Color;

import sedgewick.StdDraw;

public class Emersyn {

	/**
	 * Coordinates and dimensions use the StdDraw coordinate system
	 * So, (0.5, 0.5) is the nominal center of the screen
	 *   and 0.5 and 0.5 are the nominal halfWidth and halfHeight
	 * 
	 * @param xCenter x coordinate of center of what you draw
	 * @param yCenter y coordinate of center of what you draw
	 * @param halfWidth half the width of your drawing
	 * @param halfHeight half the height of your drawing
	 * @param howHot on a scale from -1.0 to 1.0, how hot is the emote?
	 * @param howHappy on a scale from -1.0 to 1.0, how happy is the emote?
	 * @param howOther on a scale from -1.0 to 1.0, some third emotion of your choosing
	 */
	public static void emote(
			double xCenter, double yCenter,
			double halfWidth, double halfHeight,
			double howHot, double howHappy, double howOther
			){
		//
		// Do not issue clear or show
		//  Just draw the emote to show the current values of
		//     its emotions, as represented by the inputs above
		//  You can change the face code below:  it's there so
		//    you see something when you run the program as given
		//
		
		//
		// face (Yellow circle)
		//
		double faceRad = 0.9*Math.min(halfWidth, halfHeight);		
		if(howHot<0) {
			StdDraw.setPenColor(Color.getHSBColor((float) (.48 - (howHot*.22)), 1, 1) ); 
			System.out.println("howhot < 0!");
		}
		if(howHot>0){
			StdDraw.setPenColor(Color.getHSBColor((float) (.18 - (howHot*.15)), 1, 1) );
			System.out.println("howhot > 0!");
		}
		if(howHot == 0) {
			StdDraw.setPenColor(Color.YELLOW);
			System.out.println("Firing initial case!");
		}
		
		StdDraw.filledCircle(xCenter, yCenter, faceRad);
		
		
		StdDraw.setPenColor(Color.BLACK );
		StdDraw.setPenRadius(.01);
		
		StdDraw.filledRectangle(.4, .6 + (howOther*-.03), .05, .01);
		StdDraw.filledRectangle(.6, .6 + (howOther*-.03), .05, .01);
		
		
		
		//Draw mouth
		//if(howHappy < .00000001) { This moves up and down
		if(howHappy < 0) {
			StdDraw.arc(.5, .15, .2, 85 + (howHappy*30), 95 - (howHappy*30));
		}
		if(howHappy > 0) {
			StdDraw.arc(.5, .55, .2, 268 - (howHappy*30), 272 + (howHappy*30));
		}
		if(howHappy == 0) {
			StdDraw.arc(.5, .55, .2, 269, 271);
		}
		
		//}
			
		
		
		//System.out.println("howHappy: " + howHappy);
		
		//Draw the eyes
			
			StdDraw.setPenColor(Color.white);
				StdDraw.filledCircle( .4, .5, .05);
				StdDraw.filledCircle( .6, .5, .05);
			StdDraw.setPenColor(Color.CYAN);
				StdDraw.filledCircle( .4, .5, .025);
				StdDraw.filledCircle( .6, .5, .025);
			StdDraw.setPenColor(Color.black);
				StdDraw.filledCircle( .4, .5, .01);
				StdDraw.filledCircle( .6, .5, .01);
				
			System.out.println("HSB color hue: " + (float) (.6 - (howHot*3)));
		
		
	}

}

