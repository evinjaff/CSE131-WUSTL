package exercises5;

import cse131.ArgsProcessor;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	//Original selfConcat:
	/*
	public static String selfConcat(String s) {
		return s + s;
	}
	*/
	
	public static String intConcat(int n, String s) {
		String sStore = s;
		for(int i=1;i<n;i++) {
			s = s + sStore;
		}
		return s;
	}
	
	public static String selfConcat(String s) {
		
		return intConcat(2, s);
	}
	
	public static String joinString(String[] stringArray, String joiner ) {
		String Strjoin = null;
		for(int i=0; i< stringArray.length; i++) {
			if(Strjoin == null) {
				Strjoin = stringArray[i];
			}
			else {
			Strjoin = Strjoin + stringArray[i];
			}
		}
		
		return Strjoin;
	}
	
	public static void main(String[] args) {
		
		
		
		ArgsProcessor ap = new ArgsProcessor(args);
		String sTest = ap.nextString("Test string for selfConcat?");
		int i = ap.nextInt("Test int for Concat #?");
		
		String s1 = ap.nextString("Test str 1");
		String s2 = ap.nextString("Test str 2");
		String s3 = ap.nextString("Test str 3");
		
		
		String testArray [] = {s1, s2, s3 };
		
		System.out.println(selfConcat(sTest)); 
		
		System.out.println(intConcat(i, sTest));
		
		System.out.println(joinString(testArray, " " ));
		
		//
		// Testing the methods
		//
	
	
		
		
	}

}
