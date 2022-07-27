
public class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle(double x, double y, double width, double length){
		super(x,y);
		this.width = width;
		this.length = length;
	}
	public double area() {
		return this.length*this.width;
	}
	public void resize(double newSize) {
		this.length = newSize;
		this.width = newSize;
	}
	public void resize(double newLength, double newWidth) throws CannotResizeException{
		this.length = newLength;
		this.width = newWidth;
	}
	public static void testRectangle() {
		Rectangle r = new Rectangle(1.2, 3.4, 4.0, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize come from Rectangle itself.
		System.out.println(r.getX() == 1.2);
		System.out.println(r.getY() == 3.4);
		System.out.println(r.area() == 20.0);
		// Move the rectangle.  The area does not change.
		r.move(7.8, 9.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 20.0);
		// Resize the rectangle.  The area changes but not the position.
		r.resize(12.0);
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 144.0);
		

	// Resize the rectangle again with different width and length.
		// The area changes but not the position.
		try {
			r.resize(10.0, 15.0);
		} catch(CannotResizeException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(r.getX() == 9.0);
		System.out.println(r.getY() == 12.4);
		System.out.println(r.area() == 150.0);

	}


	
}
