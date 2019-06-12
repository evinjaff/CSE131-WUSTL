package exercises4;

import java.awt.Color;
import sedgewick.StdDraw;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		
		double ballx = 0.5;
		double bally = 0.5;
		
		StdDraw.filledCircle(ballx, bally, .1);
		
		boolean isPressed = StdDraw.mousePressed();
		
		while (true) {
			isPressed = StdDraw.mousePressed();
			
			if(isPressed==true) {
			StdDraw.clear();
			x = StdDraw.mouseX();
			y = StdDraw.mouseY();
			
			//
			// Render one frame of your animation below here
			//
			
			StdDraw.filledCircle(ballx, bally, .1);
			
			ballx = ballx + (x-ballx);
			bally = bally + (y-bally);

			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
			}
		}
	}

}
