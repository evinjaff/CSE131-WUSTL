package mousefollower;

import sedgewick.StdDraw;

public class FollowTheMouse {

	/**
	 * 
	 * @return the x and y coordinate of the mouse currently
	 */
	public static double[] getMousePosition() {
		return new double[] {StdDraw.mouseX(), StdDraw.mouseY()};   // FIXME
	}

	/**
	 * Draw a ball of radius r at the specified location
	 * @param location the x and y coordinate for the ball
	 * @param r the radius of the ball
	 */
	public static void drawBall(double[] location, double r) {
		// Delete the following line and then draw the ball here as specified
		//  in the write up
		
		
		StdDraw.filledCircle(location[0], location[1], r);
		
		 
		 
		
		//throw new UnsupportedOperationException("Implement drawBall!");
	}
	
	/**
	 * 
	 * @param currentBallPosition the location of the ball currently
	 * @param mousePosition the location of the mouse currently
	 * @param speed the speed with which the ball should move toward the mouse
	 * @return the next location of the ball given its current position, the mouse's position, and the speed
	 */
	public static double[] changePosition(double[] currentBallPosition, double[] mousePosition, double speed) {
		
		mousePosition[0] = StdDraw.mouseX();
		mousePosition[1] = StdDraw.mouseY();
		
		
		currentBallPosition[0] += (StdDraw.mouseX()/speed) ; 
		currentBallPosition[1] += (StdDraw.mouseY()/speed) ;
		
		
		System.out.println("Mouse: " + mousePosition[0] + " " + mousePosition[1]);
		System.out.println("Ball: " + currentBallPosition[0] + " " + currentBallPosition[1]);
		
		drawBall(currentBallPosition, .1);
		
		
		
		
		return mousePosition;
		//throw new UnsupportedOperationException("Implement changePosition!");
	}
	public static void main(String[] args) { 
		/*
		double[] tester = new double[]{.5, .5}; 
		drawBall(tester, .2); 
		StdDraw.show(2000); 
		*/
		boolean i = false;
		while(i = true) {
			double[] currentPos = new double[]{.1, .1};
			double[] mouse      = new double[] { 0, 0 };
			changePosition(currentPos, mouse, 1);
			StdDraw.show(10);
			StdDraw.clear();
		}
	
		}
		
	}


