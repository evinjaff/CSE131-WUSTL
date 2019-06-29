package lab5;

public class Lab5Methods {
	

	public static int sumDownBy2(int n){
		int k = 0;
		for(int i=n; i>0 ;i = i -2) {
			//System.out.println("i = " + i);
			k = i + k;
		}
		
		return k;
	}
	
	public static double harmonicSum(int n){
		double k = 0;
		for(int i=1; i<=n ;i++) {
			//System.out.println("i = " + i);
			
			k = k + (1.0/i);
			
			//System.out.println("k = " + k);
			
		}
		return k;
	}
		
	
	public static double geometricSum(int n){
		// 1 + 1/2 + 1/4 + 1/8
		double k = 0;
		for(int i=0; i<=n ;i++) {
			//System.out.println("i = " + i);
			
			k = k + (1/Math.pow(2, i));
			
			//System.out.println("k = " + k);
			
		}
		
		return k;
	}
	
	public static int multPos(int x, int y) {
		//int product = 0;
		
		for(int i=1; i<y;i++) {
			x = x + (x/i);
			//product = x + product;
		}
				
		return x;
	}
	
	public static int mult(int j, int k) {
		
		int product = 0;
		
		if(j == 0 || k == 0) {
			product = 0;
			
		}
		else if (j < 0 & k> 0) {
			product = -1*(multPos(Math.abs(j),Math.abs(k)));
		}
		else if (k < 0 & j> 0) {
			product = -1*(multPos(Math.abs(j),Math.abs(k)));
		}
		else {
			product = multPos(Math.abs(j),Math.abs(k));
		}
		
		return product;
		
	}
	
	public static int expt(int n, int k) {
		int nstore = n;
		for(int i=1; i<k;i++) {
			//n = n*n ;
			n = (k==0) ? 1 : n*nstore;
			System.out.println("n = " + n);
		}
		n = (k==0) ? 1 : n; // ZeroCheck at end of for loop computations to handle zero powers
		return n;
	}
	

}
