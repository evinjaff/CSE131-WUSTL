package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {
	
	
	public static void triangle(double x, double y, double s, int n){
		// X and y are base coordinates, s is size, n is number of recursions
		
		if(n<=0) {
			return;
		}
			
		
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(.0005);
		
		//triangle coordinates
		double x1 = x;
		double y1 = y;
		double x2 = x1 + s;
		double y2 = y1;
		double x3 = (x1+x2)/2.0;
		double y3 = y1 + (Math.sqrt(3)*s/2);
		
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
		StdDraw.line(x2, y2, x3, y3);
		
		
		
		
		triangle(x1, y1, s/2.0, n-1);
		triangle((x1 + x2)/2.0, (y1 + y2)/2.0, s/2.0, n-1);
		triangle((x1 + x3)/2.0, (y1+y3)/2.0, s/2.0, n-1);
		
		
		
	}

	public static void main(String[] args) {
		
		
		triangle(0, 0, 1, 15);
		
		// TODO Auto-generated method stub
		/*
		 When I think of how to solve the triangle problem when it comes to recursion,
		 I think of one simple way to do it. Start with a large, black triangle:
		   *
		  ***
		 *****
		and then draw the midpoints of each side of the triangle, and connect the midpoints.
		After that, color in the internal shaded area by the midpoints. This would all be written
		into a method that cuts the central triangle from a triangle. Then, set the program loose,
		running until it eventually gets a return of there being no more triangles to cut. Supposedly,
		This creates an infinite fractal, but you could allways add a hand brake of stopping the 
		method once the identified triangle is x amount of pixels tall. 
		 */
		
		
	}

}
