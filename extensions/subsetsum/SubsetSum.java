package subsetsum;

public class SubsetSum {
	
	/**
	 * This static method will find a subset of the array that adds up to the sum provided
	 * @param allnums the set from which to find the numbers that add up to the provided sum
	 * @param sum the provided sum
	 * @return the subset of allnums that add up to sum
	 */
	public static int[] findSubset(int[] allnums, int sum) {
		int[] solution = new int[7];
		
		if(sum == 0) {
			return 0;
		}
		
		for(int i= 0; i<6; i++) {
			if(solution[1] + solution[2] = sum) {
				return 
			}
		}
		
		
		return solution;
	}
	
}