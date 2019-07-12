package studio1;

import cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */

public class HiFour {
	
	public static String hi(int n, String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		String names[] = new String [n];
		System.out.println("Greetings, ");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] + ", ");
		}
		
		return ", and " + names[(names.length-1)] + ". How are you?";
	}
	
	public static void main(String[] args) {
		/*
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Enter value for arg 0");
		String s1 = ap.nextString("Enter value for arg 1");
		String s2 = ap.nextString("Enter value for arg 2");
		String s3 = ap.nextString("Enter value for arg 3");
		
		String greeting = "Greetings, " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ". How are you?";
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println(greeting);
		*/
		
		
		
		hi(4);
	}
}

//Revamped as a method
