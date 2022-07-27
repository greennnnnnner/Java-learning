package question4;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle(double x, double y, double width, double length) {
		super(x,y);
		this.width = width;
		this.length = length;
	}
	public double area() {
		return this.width*this.length;
	}
	public static void testRectangle() {
		Rectangle r = new Rectangle(4.0,2.0,5.0,1.0);
		System.out.println(r.area() == 5.0);
	}
}
