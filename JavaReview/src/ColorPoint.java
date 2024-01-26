
public class ColorPoint extends Point {
	private String color; // What is the initial value of color?

	public ColorPoint(int x, int y, String color) {
		super(x, y); // what does this do?
		this.color = color;
	}
	
	// returns the color of a point
	public String getColor() {
		return color;
	}
	
	// Write toString() for color point
}
