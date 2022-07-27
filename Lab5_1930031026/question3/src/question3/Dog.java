package question3;

public class Dog {
	private String name;
	private double weight=2.0;
	public Dog(String name, double weight) {
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
		this.weight = this.weight+2.0;
	}
	public static void testDog() {
		Dog d = new Dog("Woof", 2.0);
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 2.0);
		d.feed();
		// The name is still the same but the weight increased by 2.0:
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 4.0);
		}

}
