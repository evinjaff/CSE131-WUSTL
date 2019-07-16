package slotmachine;

import java.awt.Color;

import sedgewick.StdDraw;

public class slotmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setPenColor(Color.red);
		StdDraw.filledCircle(.8, .5, .1);
		
		boolean forever = true;
		
		String signs [] = {"!", "@", "#", "$", "%"};
		
		
		while(forever = true) {
		
		//System.out.println("X: " + StdDraw.mouseX());
		//System.out.println("Y: " + StdDraw.mouseY());
		
		// && StdDraw.mouseX() > .8 && StdDraw.mouseY() >.4 && StdDraw.mouseY() <.6
		
		if(StdDraw.mousePressed() == true && StdDraw.mouseX() > .7 && StdDraw.mouseY() >.4 && StdDraw.mouseY() <.6) {
			System.out.println("Pressed Button");
			//prevents redundant triggers
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Run the slot machine
			
			for(int i=0; i<signs.length;i++) {
				
			}
			
		}
		}
	
	}

}
