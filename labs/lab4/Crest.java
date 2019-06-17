package lab4;

import java.awt.Color;

import sedgewick.StdDraw;

public class Crest {
	
	public static void drawCrest() {
		StdDraw.setPenRadius(0.08);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
		
	
		double triY [] = {0.1, 0.2, 0.1 };
		
		StdDraw.setPenRadius(0.01);
		for (int j= 0;j<3;j++) { // adding more rows
			double triX [] = {0.1, 0.175, 0.25 };
			for (int i=0;i<4;i++) {
			
			StdDraw.setPenColor(Color.RED);
			StdDraw.polygon(triX, triY);
			for (int k = 0; k<triX.length;k++) {
				if (triX[k] < .8) {
							triX[k] = triX[k] + 0.2;
					}
			
			}		
		
	}
			for (int k = 0; k<3;k++) {
				if (triY[k] < .8) {
							triY[k] = triY[k] + 0.3;
					}
			
			}
	
	
		}
		double squareX = .2;
		double squareY = .6;
	
	for(int k = 0; k<5; k++) {
		
		StdDraw.setPenColor(Color.BLUE);
		
		if(squareX >= 1) {
		
		}
		else {
			StdDraw.square(squareX, squareY, .05);
			squareX = squareX + .2;
		}
		
		
	}
	double stemX = .15;
	double stemY = .30;
	
	for(int i=0;i<8;i++) {
	
	StdDraw.setPenColor(Color.orange);
	StdDraw.filledCircle(stemX -.02, .21, .025);
	StdDraw.line(stemX, .21, stemX, stemY);
	stemX = stemX + .1;
	}
	
	}
}


