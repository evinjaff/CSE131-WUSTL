package lab7;

public class Student {
	/*
	First Name - String that can be changed
	Last Name - String that can be changed
	Student ID Number - store as String since no math is done | Edit: needs to return int
	Attempted Credits - store as double
	Passing Credits - store as double
	Total Grade Quality Points - GPA? double
	Bear Bucks Balance - int? I don't know I haven't used Bear Bucks yet
	 */

	private String first, last;
	private int id, attempt, pass, courses;
	private double gpPoints, bearBucks;

	//All this information is necessary to generate
	/*
	public Student(String first, String last, int id, int bearbucks, double gpPoints, int attempt, int pass) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.bearBucks = bearbucks;
		this.gpPoints = gpPoints;
		this.attempt = attempt;
		this.pass = pass;
		this.courses = 0;
	}

*/
	public Student(String first, String last, int id) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.gpPoints = 0;
		this.bearBucks = 0;
		this.attempt = 0;
		this.pass = 0;
	}
	
	/*
	public Student(String first, String last, int id, double bearbucks) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.courses = 0;
		this.bearBucks = bearbucks;
	}
	*/

	//Getters
	
	
	public int getId() {
		return this.id; 
	}
	public int getTotalAttemptedCredits() {
		return this.attempt;
	}

	public int getTotalPassingCredits() {
		return this.pass;
	}

	public String getLastName() {
		return this.last;
	}
	
	public String getClassStanding() {
		if(this.pass >= 90) {
			return "Senior";
		}
		if(this.pass >= 60 && this.pass < 90) {
			return "Junior";
		}
		if(this.pass < 60 && this.pass >= 30) {
			return "Sophomore";
		}
		if(this.pass < 30) {
			return "FirstYear";
		}
		return "";
	}
	
	public String getFullName() {
		return this.first + " " + this.last;
	}
	


	//Grade Mutators
	public void submitGrade(double grade, int credits) {
		double doublecredits = (double)credits;
		if(grade > 1.7) {
			for(int i=0; i<credits;i++) {
				this.gpPoints += ((grade*doublecredits)/doublecredits);
				System.out.println("gpPoints + " + ((grade*doublecredits)/doublecredits));
			}
			this.attempt += credits;
			this.pass += credits;
		}
		else {
			this.attempt += credits;
			for(int i=0; i<credits;i++) {
				this.gpPoints += ((grade*doublecredits)/doublecredits);
				System.out.println("gpPoints + " + ((grade*doublecredits)/doublecredits));
			}
		}
		System.out.println("gpPoints Total: \n");
		this.courses++;
	}

	public double calculateGradePointAverage() {

		System.out.println("GP Points:" + this.gpPoints);
		return this.gpPoints/this.attempt;		


	}




	
	//Bear Bucks Mutators
	public void deductBearBucks(double amount) {
		this.bearBucks = this.bearBucks - amount;
		return;
	}

	public void depositBearBucks(double amount) {
		this.bearBucks += amount;
		return;

	}

	public double getBearBucksBalance() {
		return this.bearBucks;
	}

	public double cashOutBearBucks() {
		if(this.bearBucks > 9.99) {
			double bearbucksstore = this.bearBucks -10;
			this.bearBucks = 0;
			return bearbucksstore;
		}
		return 0;
	}

	

	public Student createLegacy(String firstName, Student otherParent, boolean isHyphenated, int id) {
		int legacyBalance = 0;
		//System.out.println("otherParent.getBearBucksBalance(): " + otherParent.getBearBucksBalance() + "\nthis.getBearBucksBalance(): " + this.getBearBucksBalance());

		legacyBalance = (int) (otherParent.cashOutBearBucks()) + (int)(this.cashOutBearBucks());
		
		//System.out.println("Legacy Balance: " + legacyBalance);
		
		
		

		System.out.println("Legacy Balance is: " + legacyBalance);
		
		
		if(isHyphenated) {
			Student Baby = new Student (firstName, this.last + "-" + otherParent.getLastName(), id);
			Baby.depositBearBucks(legacyBalance);
			return Baby;

		}
		Student Baby = new Student (firstName, this.last, id);
		Baby.depositBearBucks(legacyBalance);
		return Baby;
	}

	public String toString() {
		return this.first + " " + this.last + " " + this.id;
	}
	/*
	a student who has completed at least 98 credits with a cumulative GPA of at least 3.60
	a student who has completed at least 75 credits with a cumulative GPA of at least 3.80
	public boolean isEligibleForPhiBetaKappa() {
		if(this.pass >= 98 && Student.getGpa() > 3.6)
		return false;
	}
	 */


	public boolean isEligibleForPhiBetaKappa() {
		if(this.calculateGradePointAverage() >= 3.60 && this.pass >= 98) {
			return true;
		}
		if(this.calculateGradePointAverage() >= 3.8 && this.pass >= 75) {
			return true;
		}
		return false;
	}

}
