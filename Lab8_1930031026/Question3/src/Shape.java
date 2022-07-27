
public class Shape {
	private double x;
	private double y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void move(double dx, double dy) {
		this.x = this.x+dx;
		this.y = this.y+dy;
	}
	public double area() {
		
		return -1.0;//return to a double value and report the error
	}
	public void resize(double newSize) throws Exception{
		throw new Exception("Cannot resize undefined Shape");
	}
	public static void testShape() {
		Shape s = new Shape(3.0, 2.0);
		System.out.println(s.getX() == 3.0);
		System.out.println(s.getY() == 2.0);
		System.out.println(s.area() == -1.0);
		s.move(1.0, 1.0);
		System.out.println(s.getX() == 4.0);
		System.out.println(s.getY() == 3.0);
		
	}
}
