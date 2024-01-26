
public class Square {
	protected int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public int area() {
		return side * side;
	}
	
	public int perimeter() {
		return 4 * side;
	}

}
