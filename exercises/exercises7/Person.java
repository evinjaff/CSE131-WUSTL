package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
//           Name \/
public class Person {  
	
	//Instace Variables
	private int height, age;
	
	//Constructor \/
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	//Mutators \/
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	//Getters \/
	public int getHeight() {
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
	

}
