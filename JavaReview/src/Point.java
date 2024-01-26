
public class Point {
	// Instance variables:
	private int x; // What are the initial values of x and y? 
	private int y;
	// Scope of a variable: where it can be accessed
	
	// Can we count how many points we have created? 
	
	// Constructor:
	public Point (int x, int y) {
		// this refers to "this object", this.x is instance var, x is a parameter
		// parameters are local variables: they exist only within a method
		this.x = x; 
		this.y = y;
	}

	// the method returns the x coordinate of the point
	public int getX() {
		return x; // why do I not need this.x? 
	}

	// the method returns the y coordinate of the point
	public int getY() {
		return y;
	}
	
	// The method returns the distance of a point from zero
	public double distanceFromZero() {
		return Math.sqrt(x * x + y * y);
	}
	
	// Write a method that computes a distance between this point 
	// and another point
	
	public String toString() {
		return "Point (" + x + "," + y + ")";
	}

}
