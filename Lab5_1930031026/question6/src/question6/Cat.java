package question6;

public class Cat extends Animal {
	public Cat(String name, double weight) {
		super(name, weight);
	}
	
	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 2.0);
		c.setWeight(3.0);
		// The name is still the same but the weight increased by 1.0:
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 3.0);

	}
}
