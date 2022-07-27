package question6;

public class Animal {
	private String name;
	private double weight=2.0;
	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public static void testAnimal() {
		Animal a = new Animal("Ani", 3.0);
		System.out.println(a.getName()=="Ani");
		a.setWeight(4.0);
		System.out.println(a.getWeight()==4.0);
		System.out.println(a);
	}
}