package question2;

public class Circle extends Shape {
	private double radius;
	public Circle(double x, double y, double radius){
		super(x, y);
		this.radius = radius;
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	public static void testCircle() {
		Circle c = new Circle(1.0,1.0,1.0);
		System.out.println(c.area()==Math.PI);
	}
}	
