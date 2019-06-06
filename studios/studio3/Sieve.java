package studio3;

import cse131.ArgsProcessor;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int primeLimit = ap.nextInt("Enter maximum value");
		
		int [] numberLine = new int [primeLimit];
		
		for(int i=2; i<primeLimit;i++) {
			numberLine[i-2] = i;
		}
		for(int i=2; i<(numberLine.length/2);i++) {
			
			
			for(int k=i*2; k<numberLine.length;k = k+i) {
			
				numberLine[k-2] = 0;

			}
		}
		for(int i=0; i<numberLine.length;i++) {
			if(numberLine[i] != 0){
				System.out.print(numberLine[i] + ", ");
			}
		}
	}

}
