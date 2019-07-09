package exercises6;

public class FactorialNoBaseCase {
	
	public static int factorial(int n) {
		return n * factorial(n-1);
	}

	public static void main(String[] args) {
		int ans = factorial(2);
		System.out.println("Answer is " + ans);
	}
}

/* 
 * This fails because there is no "stop" for the factorial, meaning that it continues to run 
 * until the stack overflows. In the case of the human reproduction theory, this would mean
 * that since there would be no cap on how many children a woman would have, if a no base
 * case model is applied to this theory, then women would swell up with an infinite number of
 * eggs unless there was a hard cap on how many children a woman could have, which in this 
 * theory, is not stated.
 * 
*/