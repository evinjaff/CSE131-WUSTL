package bankinterest;

import cse131.ArgsProcessor;

public class interestcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double withdrawAmount = 100.00;
		double depositAmount = 200.50;
		double interestPct = 0.02;
		double interestAmt = 0.0;
		
		double withdrawDeposit = 0;
		double acctBalance = 4000.00;
		double finalBalance = 0.0;
		double delta = 0.0;
		System.out.println("Day \t | Transaction |  Amount  | Balance");
		System.out.println("--------------------------------------------------------------------------");
		for(int dayCount=1;dayCount<=30;dayCount++) {
			withdrawDeposit = Math.random(); // 0 means withdraw 1 means deposit
			
			if(withdrawDeposit < 0.5) {
				acctBalance = acctBalance - withdrawAmount;
				System.out.println("Day " + dayCount + "\t |  Withdrawn  |  $" + withdrawAmount + "  | $" + acctBalance);
			}
			else {
				acctBalance = acctBalance + depositAmount;
				System.out.println("Day " + dayCount + "\t |  Deposited  |  $" + depositAmount + "  | $" + acctBalance);
			}
			
			if(dayCount == 30) {
				interestAmt = Math.round((acctBalance*interestPct)*100)/100.00;
				finalBalance = acctBalance+interestAmt;
				System.out.println("Interest Earned: $" + interestAmt);
				System.out.println("Final Balance: $" + finalBalance);
			}
		}
		
	}

}
