package calculator;

public class Computations {

	/**
	 * Complete the static methods as described on the 
	 * description for this assignment.
	 */
	

	/**Double operators**/
	//Returns the result of adding d1 and d2.
	public static double addDoubles(double d1, double d2) {
		return d1 + d2;
	}

	//Return the result of subtracting d2 from d1.
	static double subtractDoubles(double d1, double d2) {
		return d1-d2;
	}

	//Return the result of dividing d1 by d2.
	static double divideDoubles(double d1, double d2) {
		if(d2 == 0) {
			return 0;
		}
		else {
			return d1/d2;
		}
	}

	//Return the result of multiplying d1 and d2.
	static double multiplyDoubles(double d1, double d2) {
		return d1*d2;
	}



	/**Int operators**/

	//Return the result of adding i1 and i2.
	static int addInts(int i1, int i2) {
		return i1 + i2;
	}

	//Return the result of subtracting i2 from i1.
	static int subtractInts(int i1, int i2) {
		return i1 - i2;
	}

	//Return the result of dividing i1 by i2.
	static int divideInts(int i1, int i2) {
		if(i2 == 0) {
			return 0;
		}
		else {
			return i1/i2;
		}
	}

	//Return the result of multiplying i1 and i2.
	static int multiplyInts(int i1, int i2) {
		return i1*i2;
	}



	/**String operators**/	
	//	//Return the result of concatenating s2 to s1.
	static String concatenate(String s1, String s2) {
		return s1 + s2;
	}



	/**Boolean operators**/
	//Return the boolean value that results from an AND operation of b1 and b2
	static boolean andBoolean(boolean b1, boolean b2) {
		return b1 && b2;
	}
	//Return the boolean value that results from an OR operation of b1 and b2
	static boolean orBoolean(boolean b1, boolean b2) {
		return b1 || b2;
	}

	/**Casting to int**/
	static int intToInt(int in) {
		System.out.println("Warning: this operation is unecessary");
		return (int)in;
	}
	static int doubleToInt(double in) {
		System.out.println("Warning: information may be lost");
		return (int)in;
	}
	static int stringToInt(String in) {
		System.out.println("Error: Cannot cast to int");
		throw new UnsupportedOperationException("Cannot cast String to int");
	}
	static int booleanToInt(boolean in) {
		System.out.println("Error: Cannot cast to int");
		throw new UnsupportedOperationException("Cannot cast boolean to int");
	}


	/**Casting to double**/
	static double intToDouble(int in) {
		return (double)in;
	}
	static double doubleToDouble(double in) {
		System.out.println("Warning: this operation is unecessary");
		return (double)in;
	}
	static double stringToDouble(String in) {
		System.out.println("Error: Cannot cast to double");
		throw new UnsupportedOperationException("Cannot cast String to double");
	}
	static double booleanToDouble(boolean in) {
		System.out.println("Error: Cannot cast to double");
		throw new UnsupportedOperationException("Cannot cast boolean to double");
	}


	/**Casting to String**/
	static String intToString(int in) {
		return Integer.toString(in);
	}
	static String doubleToString(double in) {
		return Double.toString(in);
	}
	static String stringToString(String in) {
		System.out.println("Warning: this operation is unecessary");
		return (String) in;
	}
	static String booleanToString(boolean in) {
		return Boolean.toString(in);
	}


	/**Casting to Boolean**/
	static boolean intToBoolean(int in) {
		System.out.println("Error: Cannot cast to boolean");
		throw new UnsupportedOperationException("Cannot cast int to boolean");
	}
	static boolean doubleToBoolean(double in) {
		System.out.println("Error: Cannot cast to boolean");
		throw new UnsupportedOperationException("Cannot cast double to boolean");
	}
	static boolean stringToBoolean(String in) {
		System.out.println("Error: Cannot cast to boolean");
		throw new UnsupportedOperationException("Cannot cast string to boolean");
	}
	static boolean booleanToBoolean(boolean in) {
		System.out.println("Warning: this operation is unecessary");
		return (boolean)in;
	}


}
