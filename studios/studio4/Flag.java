package studio4;

import java.awt.Color;

import sedgewick.StdDraw;

public class Flag {

	
	public static void main(String[] args) {
		//
		//  Add code for your studio below here.
		//
		double bordX [] = {0.0, 1.0, 1.0, 0.0, 0.0 }; 
		double bordY [] = {0.0, 0.0, 1.0, 1.0, 0.0 };
		
		double triX [] = {0.2, 0.3, 0.4, 0.2};
		double triY [] = {0.2, 0.4 , 0.2, 0.2 };
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.setPenRadius(0.2);
		
		StdDraw.polygon(bordX, bordY);
		StdDraw.setPenColor(Color.green);
		for(int i=0; i<3; i++) {
		StdDraw.filledPolygon(triX, triY);
			for(int k=0; k<triX.length;k++) {
				triX[k] = triX[k] + .2;
			}
		}
		
	}

}
