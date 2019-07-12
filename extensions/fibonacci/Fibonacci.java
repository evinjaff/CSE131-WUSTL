package fibonacci;

public class Fibonacci {

	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if(n <= 0) {
			return n;
		}
		
		return Math.abs(recursive(n-1) + recursive(n-2));
		
	}

	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		
		int number1 = 1;
		int number2 = 0;
		int result = 0;
		
		if(n<=0) {return result; }

		for(int i=0; i<n;i++) {
			
			result = number1 + number2;
			number1 = number2;
			number2 = result;
			System.out.println(result);
			
			
		}
		
		return result; 
	}
	
	public static void main(String args[]) {
		System.out.println(iterative(8));
	}

}
