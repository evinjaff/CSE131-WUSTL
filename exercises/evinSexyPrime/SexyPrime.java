package evinSexyPrime;

import cse131.ArgsProcessor;

public class SexyPrime {
	/** 
	 * Given a Number, Check to see if the number is a sexy prime (has a prime number that is 6 greater or less than it) 
	 *
	 **/
	
	public static void main(String args[]) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//How ArgsProcessor works: Processes inputs and displays them. ArgsProcessor is an object, and that is why we say it is a new one and that 
		//int testedNumber = ap.nextInt();
		
		double a = 1.0/2.0 + 3.5 * 7.3;
		
		//Java works right to left like Hebrew but follows PEMDAS
		
		//System.out.println(a);
		
		for(int i=0;i<12;i++) {
			//System.out.println(i);
		}
		//System.out.println("\nEnd of for loop\n");
		/*int i = 0;
		while(i<12) {
			//System.out.println(i);
			i++;
		}
		/*
		for(int i=0;i<100;i++) {
		double x = Math.random();
		int y = (int) (x*6 + 1);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		}
		*/
		/*
		for(int i=0;i<=3;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(i + " " + j);
			}
		}
		*/
		
		boolean A = true || true;
		String s = "1" + 3 + 1;
		
		System.out.println("A = " + A);
		
		System.out.println(s);
		
	}
	
}
