
public class Circle extends Shape {
	private double radius;
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	public double area() {
		return radius*radius*Math.PI;
	}
	public void resize(double newRadius) {
		this.radius=newRadius;
	}
	public static void testCircle() {
		Circle c = new Circle(1.2, 3.4, 4.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Circle itself.
		System.out.println(c.getX() == 1.2);
		System.out.println(c.getY() == 3.4);
		System.out.println(c.area() == Math.PI * 16.0);
		// Move the circle.  The area does not change.
		c.move(7.8, 9.0);
		System.out.println(c.getX() == 9.0);
		System.out.println(c.getY() == 12.4);
		System.out.println(c.area() == Math.PI * 16.0);
		// Resize the circle.  The area changes but not the position.
		c.resize(8.0);
		System.out.println(c.getX() == 9.0);
		System.out.println(c.getY() == 12.4);
		System.out.println(c.area() == Math.PI * 64.0);
	}

}
