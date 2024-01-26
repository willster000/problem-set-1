
public class TestPoints {

	public static void main(String[] args) {
		// Create a couple of points:
		Point p1 = new Point(2, 4);
		Point p2 = new Point(-2, 4);
		
		System.out.println("Distance from zero for p1 = " + 
				p1.distanceFromZero());
		System.out.println("Distance from zero for p2 = " + 
				p2.distanceFromZero());
		
		
		// How can we get p1's x and y? 
		
		// Can we change x or y in points?
		
		// Test a method for a distance between two points:
		
		// Create color points
		ColorPoint cp1 = new ColorPoint(2, 4, "blue");
		ColorPoint cp2 = new ColorPoint(-2, 4, "green");
		
		// Can I find their distance from zero? 
		
		// Can I find distance between two color points? A point and a color point?

		
		// Which of the following is a valid statement? Why?
		// Point p3 = new ColorPoint(3, 3, "maroon");
		//ColorPoint cp3 = new Point(3,3);
		
		// What methods can be called on this variable? 
		
	}

}
