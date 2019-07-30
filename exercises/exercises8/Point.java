package exercises8;

import java.util.HashSet;
import java.util.Set;

public class Point {
	
	//
	// has-a x and y coordinate, both integers
	//  these are immutable so you should declare them "final"
	//
	// declare instance variables here:
	//
	private final double x, y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Point testPoint = new Point(.5, 1);
		System.out.println(testPoint);
		
		Set<Point> set = new HashSet<Point>();
		set.add(new Point(131, 132));
		set.add(new Point(131,132));
		set.contains(new Point(131,132));
		System.out.println("Set has " + set);
		
		
	}

}

/*
 * Find and open the Point class in the exercises8 package of the exercises folder.
Based on the comment you see there concerning has-a, declare the instance variables for this class, calling them x and y.
Auto-generate the constructor by choosing Source and then Generate Constructor using Fields….
Choose the fields x and y, and finish to generate the constructor.
Admire the work eclipse just did for you.
These fields will be immutable, so edit the declarations for x and y and add the final attribute.
This ensures that the values of x and y can be set only by the constructor.
Now use eclipse to generate the getters for x and y.
Usually the menu you are presented would also offer to generate setters but eclipse knows the relevant variables are final and cannot be set after construction.
In the main() method, construct and print a Point or two and verify that things look good.
They should not look so good. When you print a Point, you get an ugly and uninformative String. To get something better, we must override the toString() method.
Use eclipse similarly to generate a simple toString() method.
This, and the subsequent work below, is accomplished also via the Source menu.
OK we are ready to make a Set of some points. Put the following code in the main method:
Set<Point> set = new HashSet<Point>();
set.add(new Point(131, 132));
set.add(new Point(131,132));
System.out.println("Set has " + set);
Recalling that sets should have no duplicates, you the output from the above code should show the set having the same point twice.
This is because Java is using its built-in notion of equality: are two objects exactly the same object (as in, the same reference in memory)?
We need to change this behavior, so read on.
Now let's use eclipse to generate hashCode() and equals(Object other) methods.
You must pick the attributes (instance variable names) upon which you wish equality to be based.
Rerun your code and make sure that two Point objects with the same coordinates cannot both be contained in the same set.
 */
