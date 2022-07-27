
public class Dot extends Shape{
	public Dot(double x, double y) {
		super(x,y);
	}
	public double area() {
		return 0.0;
	}
	public void resize(double newSize) throws Exception {
		throw new Exception("Cannot resize a dot!");
	}
	public static void testDot() {
		Dot d = new Dot(1.2, 3.4);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Dot itself.
		System.out.println(d.getX() == 1.2);
		System.out.println(d.getY() == 3.4);
		System.out.println(d.area() == 0.0);
		// Move the dot.  The area does not change.
		d.move(7.8, 9.0);
		System.out.println(d.getX() == 9.0);
		System.out.println(d.getY() == 12.4);
		System.out.println(d.area() == 0.0);
		// Resize the dot.  An exception is thrown, caught, and tested.
		try {
			d.resize(12.3);
		} catch(Exception ex) {
			System.out.println(ex.getMessage() == "Cannot resize a dot!");
			}
		// The area and position do not change.
		System.out.println(d.getX() == 9.0);
		System.out.println(d.getY() == 12.4);
		System.out.println(d.area() == 0.0);
	}
}
