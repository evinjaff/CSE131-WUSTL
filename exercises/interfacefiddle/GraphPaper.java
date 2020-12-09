package interfacefiddle;

import cse131.ArgsProcessor;

import sedgewick.StdDraw;

public class GraphPaper {
	//Recursive Graph Paper Method
	public void Graph(double x, double y) {
		
		if(x >= 1) {
			return;
		}
		
		StdDraw.setPenRadius(.01);
		
		double x0 = x;
		double x1 = x;
		double y0 = 0;
		double y1 = 1;
		
		StdDraw.line(x0, y0, x1, y1);
		Graph(x+.1);
		graph
		
	}
	
	
	//Main Method
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		Graph(0, 1);
		
		String a = "text";
		String b = "text";
		
		a.equals(b);
		
	}
}
