package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	
	public static double avg3(int x, int y, int z) {
		return (x+y+z)/3.0;
	}
	
	public static double sumArray(double[] a) {
		double sum = 0.0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	public static double average(double [] a) {
		double sum = sumArray(a);
		return sum/(double)(a.length);
	}
	public static String pig(String n) {
		//n.substring(1);
		n = n.substring(1) + n.substring(0, 1) + "ay";
		return n;
	}
	public static double division(int x, int y) {
		return x/y;
	}
}
