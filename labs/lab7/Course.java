package lab7;

public class Course {
	
	/*
	 * Name of the course
			Credits a student earns by taking this course
			Roster of seats available for Students
			Number of seats that have been taken.
	 */
	
	private String name;
	private int credits, seatsTaken;
	private String [] roster;
	
	public Course(String name, int credits, int seatsTaken, int roster) {
		this.name = name;
		this.credits = credits;
		this.seatsTaken = seatsTaken;
		this.roster = roster;
		
	}
	
	//toString Constructor
	public Course(String name, int credits) {
		this.name = name;
		this.credits = credits;
	}
	
	public boolean addStudent(Student s) {
		
	}
	
	
	//Returns Course # and Credits
	public String toString() {
		return this.name + this.credits;
	}

}
