package question1;

public class Cat {
	private String name;
	private double weight=2.0;
	public Cat(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public void feed() {
		this.weight = this.weight+1.0;
	}
	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 2.0);
		c.feed();
		// The name is still the same but the weight increased by 1.0:
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 3.0);

	}
}
