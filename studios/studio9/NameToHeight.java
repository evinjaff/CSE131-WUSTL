package studio9;

import java.util.HashMap;
import java.util.Map;

import cse131.ArgsProcessor;
import cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		
		Map<String, Integer> heights = new HashMap<String, Integer>();
		
		Integer evinHeight = new Integer(72);
		Integer ShaqHeight = new Integer(85);
		
		heights.put("Evin", ShaqHeight);
		heights.put("Shaq", ShaqHeight);
		
		while(true) {
			String input = ap.nextString("Enter team member's height");
			
			if(heights.get(input) != null) {
				System.out.println(input + " is " + heights.get(input) + " inches tall");
			}
			else if(input.equals("end")) {
				System.exit(0);
			}
			else {
				System.out.println("Error: Unable to understand who person " + input + " is");
			}
			
			
			
		}
		
	}
}
