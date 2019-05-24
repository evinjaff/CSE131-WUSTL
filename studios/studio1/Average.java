package studio1;
import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int val1 = ap.nextInt("Enter value 1");
		int val2 = ap.nextInt("Enter value 2");
		
		int avg = (val1 + val2)/2;
		
		System.out.println(avg);

	}

}
