package lab7;

public class Course {
	
	/*
	 * Name of the course
			Credits a student earns by taking this course
			Roster of seats available for Students
			Number of seats that have been taken.
	 */
	
	private String name;
	private int credits, seatsTaken, seatsOpen, capacity;
	private Student [] roster;
	
	public Course(String name, int credits, int capacity) {
		this.name = name;
		this.credits = credits;
		this.seatsOpen = capacity;
		this.capacity = this.seatsOpen;
		this.roster = new Student [this.capacity+1];
		
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	public int getCredits() {
		return this.credits;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getSeatsRemaining() {
		return this.seatsOpen;
	}
	
	
	public boolean addStudent(Student s) {
		
		if(this.seatsOpen > 0) {
			//Sees if the same student is already registered
			for(int i=0;i<this.roster.length;i++) {
				if(this.roster[i] == s) {
					return false;
				}
			}

			//Adds seat at the next available array

			int seatNumber = this.capacity-this.seatsOpen;

			this.roster[seatNumber] = s;
			this.seatsOpen--;



			return true;

		}
		else {
			return false;
		}
	}
	
	
	/*
	 * String generateRoster()
	Returns a String that represents a roster with all of the Students in the course. 
	The roster should contain the Students' names. Make sure to omit empty seats!
	 */
	public String generateRoster() {
		String names = "";
		for(int i=0;i<this.roster.length-1;i++) {
			
			try {
				  //  Tries to add names and catches NullPointerExceptions to prevent code from crashing
				names += this.roster[i].getFullName();
				}
			catch(Exception NullPointerException) {
				  
			}
			
			
			
		}
		System.out.println(names);
		return names;
	}
	
	// calculates average GPA
	public double calculateAverageGPA() {
		double avg = 0;
		int counter = 0;
		for(int i=0;i<this.roster.length-1;i++) {

			try {
				//  Try to calculate GPA without triggering accidental Null Pointer Exceptions
				avg += this.roster[i].calculateGradePointAverage();
				counter++;
				System.out.println("Avg: " + avg);

			}
			catch(Exception NullPointerException) {

			}

		}
		System.out.println("\nAvg total: " + avg + "\n\n");
		
		avg = avg/counter;
		
		return avg;
	}

	//Returns Course # and Credits
	public String toString() {
		return this.name + this.credits;
	}

}
