package apartment;

public class Apartment {
	
	/**
	 * Complete this method. It takes in an array of random doubles and k-the stopping point. 
	 * Your code should iterate through the first k values of the array and record the maximum value.
	 * Then it should iterate through the remainder of the array and return the NEXT value 
	 * that is higher than one recorded in the first portion of the array.
	 * 
	 * @param values the array containing the random doubles
	 * @param k the integer representing the stopping point
	 * @return
	 */
	public static double findBestValueAfterStopAtK(double[] values, int k) {
		double maxStore = 0.0;
		double avgEr = 0.0;
		int count = 0;
		for(int i=0;i<=k;i++) {
			if(values[i] > maxStore) {
				maxStore = values[i];
			}
			avgEr += values[i];
			count = i;
		}
		
		avgEr = avgEr/(k+1);
		
		for(int i=count;i<values.length;i++) {
		if(values[k] > avgEr) {
			maxStore = values[k];
			return maxStore;
		}
		}
		
		/*
		double secondMax = 0.0;
		for(int j=k;j<values.length;j++) {
			if(values[j] > maxStore) {
				secondMax = values[j];
			}
		}
		*/
		
		return maxStore; //FIXME
	}
	
	/**
	 * You'll need to complete this method as well. It takes in number of apartments the user is considering. 
	 * Do not worry about the specific value of options, but it should suggest
	 *   the size of the array you are using.
	 * Finally, the method should return the integer which represents the optimal stopping point.
	 * 
	 * @param apartments-the number of apartments being considered
	 * @param trials-the number of experimentation trials done for a specific stopping point
	 * @return 
	 */
	public static int findOptimalStoppingPoint(int apartments, int trials) {
		return 0; //FIXME
	}
}
