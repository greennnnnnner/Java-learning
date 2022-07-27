package question6;

public class Square extends Rectangle {
	private double size;
	public Square(double x, double y, double size) {
		super(x,y,size,size);
		this.size=size;
	}
	public static void testSquare() {
		Square s = new Square(4.0,2.0,4.0);
		System.out.println(s.area()==16.0);
	}
}
