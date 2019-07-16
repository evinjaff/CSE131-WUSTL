package eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		int Ncount = 0;
		boolean shouldExit = false;
		boolean placeEye = false;
		while(Ncount < N) {
			if(StdDraw.mousePressed() == true) {
				//prevents multiple triggers on one click
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Pressed Button");
				
				placeEye = true;
				//Run the rest of the code
				
				StdDraw.setPenColor(Color.BLACK);

				StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), .1);
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), .1);
				
				
				Ncount++;
				
			}
			if(placeEye) {
			
			StdDraw.setPenColor(Color.red);
			StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), .025);
			placeEye = false;
			}
			
		}
	}

}
