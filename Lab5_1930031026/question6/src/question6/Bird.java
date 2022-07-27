package question6;
public class Bird extends Animal {
	private double altitude;
	public Bird(String name, double weight, double altitude) {
		super(name, weight);
		this.altitude=altitude;
	}
	public double getAltitude() {
		return this.altitude;
	}
	public static void testBird() {
		Bird b = new Bird("bi", 1.0, 90.0);
		System.out.println(b.getName()=="bi");
		System.out.println(b.getAltitude()==90.0);
	}
}
