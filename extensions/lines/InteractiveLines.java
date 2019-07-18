package lines;

import java.awt.Color;

import sedgewick.StdDraw;

public class InteractiveLines {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		while (true) {
			//
			// Wait for the mousebutton to be pressed
			//
			while (!StdDraw.mousePressed()) {
				// wait, do nothing
			}
			//
			// Capture the mouse's location is now that is has been pressed
			//
			double x1 = StdDraw.mouseX();
			double y1 = StdDraw.mouseY();
			System.out.println("Mousepos0captured");
			//
			// Now wait for the button to be released
			//
			while (StdDraw.mousePressed()) {
				// wait, do nothing
				
			}
			
			//
			// Capture the mouse's location now that it has been released
			//
			double x2 = StdDraw.mouseX();
			double y2 = StdDraw.mouseY();
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			System.out.println("y1 = " + y1);
			System.out.println("y2 = " + y2);
			
			//
			// Run the student's code to draw the line
			//
			StdDraw.setPenColor(Color.black);
			StdDraw.setPenRadius(.1);
			Lines.drawLine(.6, .8, .25, .75);

		}

	}

}
