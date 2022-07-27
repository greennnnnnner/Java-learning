
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
		Circle c = new Circle(2.0,2.0,1.0);
		System.out.println(c.getX()==2.0);
		System.out.println(c.getY()==2.0);
		System.out.println(c.area()==Math.PI);
		c.resize(2.0);
		System.out.println(c.area()==4*Math.PI);
	}
}
