package arrays;
import cse131.ArgsProcessor;

public class Birthday {

	public static void main(String[] args) {
		//assuming 31 day months
		ArgsProcessor ap = new ArgsProcessor(args);
		int people = ap.nextInt("How many people do you want to use?");
		int calTable [][] = new int [13][32];

		for(int i=0; i<people;i++) {

			int month = 1 + (int) (Math.random()*12);
			int day = 1 + (int) (Math.random()*31);

			calTable[month][day]++;
			//System.out.println(month + "/" + day + " | " + calTable[month][day]);


		}
		int monCount = 0;
		double pctMon = 0.0;
		double pctstore [] = new double [13];
		for(int mn=1;mn<=12;mn++){
			monCount = 0;
			for(int dy=1;dy<=31;dy++){
				//System.out.println(mn + "#" + dy);
				if(calTable[mn][dy] > 0) {
					//System.out.println("Bdays found!");
					monCount = monCount + calTable[mn][dy];
				}
			}
			pctMon = ((monCount*1.0)/(people*1.0)) *100;
			pctstore[mn]= pctMon;

			//System.out.println("Month: " + mn + " | " + monCount + " Birthdays = " + pctMon + "% of the people have a birthday in this month");
		}
		//Computes month average - despite the fact its a constant
		double pctcomp = 0.0;
		for (int i=1;i<13;i++) {
			pctcomp = pctstore[i] + pctcomp;
		}
		pctcomp = pctcomp/12.0;
		System.out.println("\nAverage percent of how many people have a birthday each month: " + pctcomp + "\n");
		
		//for loop computes and stores day percents
		double dayPctcomp = 0.0;
		int daytally = 0;
		double dayPct = 0.0;
		for(int dy=1;dy<=31;dy++) {
			daytally = 0;
			for(int mn=1;mn<=12;mn++) {
				daytally = calTable[mn][dy] + daytally;
				
			}
			dayPct = (daytally/(people*1.0))*100;
			dayPctcomp = dayPct + dayPctcomp;
			System.out.println("For on the " + dy + " day of the month there are " + daytally + " birthdays counting all 12 months, which is " + dayPct + "% of the total number of birthdays");
		}
		
		
		
			
		dayPctcomp = dayPctcomp/31.0;
		System.out.println("\nAverage percent of how many people have a birthday each month: " + dayPctcomp + "%\n");
		
		//for loop that computes how many people have matching birthdays
		int matchTally = 0;
		double matchPct = 0.0;
		/*
		for(int dy=1;dy<=31;dy++) {
			for(int mn=1;mn<12;mn++) {
				if(calTable[mn][dy] > 1) {
					matchTally = matchTally+calTable[dy][mn];
					
				}
			}
		}
		*/
		int count = 0;
		for(int mn=1;mn<=12;mn++){
			for(int dy=1;dy<=31;dy++){
				
				if(calTable[mn][dy] >= 2) {
					
					matchTally += calTable[mn][dy];
					//System.out.println("On " + mn + "/" + dy + " there were " + calTable[mn][dy] + " people");
				}
				System.out.println("On " + mn + "/" + dy + " there were " + calTable[mn][dy] + " people");
				//count += calTable[mn][dy];
				//System.out.println(count);
				System.out.println(matchTally);
			}
			
		}
		System.out.println(matchTally);
		
		
		matchPct = ((matchTally*1.0)/(people*1.0))*100.0;
		
		System.out.println("Percentage of people who have matching birthdays: " + matchPct + "%");





	}

}
