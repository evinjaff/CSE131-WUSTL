package lab10;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Random;

import sedgewick.StdDraw;

public class Main {
	public static void main(String[] args) {
		
		double px = 0.5;  // x location of the demo point
		double py = 0.0;  // y location of the demo point
		
		while (true) {
			StdDraw.clear();		

			//
			// Should we move?
			//
			if (checkFor(KeyEvent.VK_F)) {
				px = px - 0.003;
			}
			if (checkFor(KeyEvent.VK_J)) {
				px = px + 0.003;
			}
			

			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(px, py, .03);		
			
			StdDraw.show(10);  // 1/100 of a second
		}

	}
	
	/**
	 * Check to see if a given key is pressed at the moment.  This method does not
	 *   wait for a key to be pressed, so if nothing is pressed, it returns
	 *   false right away.
	 *   
	 * The event constants are found at:
	 *   https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
	 * @param key the integer code of the key
	 * @return true if that key is down, false otherwise
	 */
	private static boolean checkFor(int key) {
		if (StdDraw.isKeyPressed(key)) {
			return true;
		}
		else {
			return false;
		}
	}

}
