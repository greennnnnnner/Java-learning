package question7;

public class Dot extends Shape {
	Dot(double x, double y){
		super(x,y);
	}
	public double area() {
		return 0.0;
	}
	public String toString() {
		String temp = "Dot has area "+this.area();
		return temp;
	}
	public static void testDot() {
		Dot d = new Dot(1,3);
		System.out.println(d.area() == 0.0);
	}

}
