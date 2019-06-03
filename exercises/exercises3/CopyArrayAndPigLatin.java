package exercises3;

public class CopyArrayAndPigLatin {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Carole", "David", "Elaine" };
		String[] pigNames = new String[names.length];
		
		for (int i=0;i<names.length;i++) {
			pigNames[i] = names[i] + "ay"; // I still don't understand Pig Latin, is it just adding an -ay to the end of everything?
			System.out.println(pigNames[i]);
		}
		// first copy the above array into an array named copy
		//  Pretend the names array is large
		//  So we cannot just do the following (too much to type):
		//     String[] copy = { names[0], names[1], names[2] };
		//
		
		
		// 
		// Follow the instructions on the web page to check
		// that your copy is correct.  Then cause the copy to store the
		// copied strings in "Pig Latin".  Do this by iteration without
		// assuming the length or contents of the names array.
		//
		
	}

}
