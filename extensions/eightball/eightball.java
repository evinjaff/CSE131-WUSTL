package eightball;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class eightball {
	
	public static void drawCircle() {
		double trix [] = {.1, .5, .9};
		double triy [] = {.7, .1, .7};
		StdDraw.setPenColor(Color.black);
		StdDraw.filledCircle(.5, .5, .5);
		//StdDraw.show(750);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledPolygon(trix, triy);
		//StdDraw.show(750);
		StdDraw.setPenColor(Color.WHITE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.setPenColor(Color.black);
		//StdDraw.filledCircle(.5, .5, .5);
		
		
		
		int Que = 1;
		
		while(Que == 1) {
		String Question = ap.nextString("Enter your question\nType 0 to exit");
		if(Question.contains("0")) {
			System.exit(0);
		}
		else {
			drawCircle();
			
			//Phrase Generation
			
			String response = "";
			
			double strChoice = Math.random()*100;
			
			System.out.println("strChoice= " + strChoice);
			
			if(strChoice >= 80) {
				response = "Yes";
			}
			
			if(strChoice >= 60 && strChoice < 80) {
				response = "No";
			}
			if(strChoice >= 40 && strChoice < 60) {
				response = "It could happen";
			}
			if(strChoice >= 20 && strChoice < 40) {
				response = "Ask again";
			}
			if(strChoice >= 0 && strChoice < 20) {
				response = "It is almost certain";
			}
			StdDraw.setFont();
			
			for(double k = .515;k>=.5; k = k -.001) {
				System.out.println("k = " + k);

				for(double i = .5; i<k; i = i + .001) {
					StdDraw.text(i, .5, response);
					StdDraw.text(.5, i, response);
				}
				StdDraw.show(1000);
				drawCircle();
			}
			// blur right/up
			/*
			for(double k = .515;k>=.5; k = k -.001) {
				System.out.println("k = " + k);

				for(double i = .5; i<k; i = i + .001) {
					StdDraw.text(i, .5, response);
					StdDraw.text(.5, i, response);
				}
				//StdDraw.show(1000);
				//drawCircle();
			}
			*/
			
			//blur down/left
			for(double k = .2;k>=.5; k = k + .001) {
				System.out.println("k = " + k);

				for(double i = .4; i>k; i = i + .001) {
					StdDraw.text(i, .5, response);
					StdDraw.text(.5, i, response);
				}
				StdDraw.show(1000);
				drawCircle();
			}

			StdDraw.clear();
					
			//StdDraw.text(.5000001, .5000001, response);
			//StdDraw.text(.5, .5, response);
			//StdDraw.text(.4999999, .4999999, response);
			//StdDraw.show(750);
			
			

		}
		}
	}

}

/*
 * for(double i = .5; i<.509; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			drawCircle();
			for(double i = .5; i<.508; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			drawCircle();
			for(double i = .5; i<.507; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.506; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.505; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.504; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.503; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.502; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.501; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
			for(double i = .5; i<.5; i = i + .001) {
				StdDraw.text(i, .5, response);
				StdDraw.text(.5, i, response);
			}
			StdDraw.show(200);
			drawCircle();
*/
