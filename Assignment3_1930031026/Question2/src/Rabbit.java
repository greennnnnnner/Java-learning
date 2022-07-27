
public class Rabbit extends Mammal{
	private double weight;//describes the weight of the rabbit
	public Rabbit(String name, double weight){
		super(name);
		this.weight = weight;
	}//constructor takes name and weight
	public double getWeight() {
		return this.weight;
	}
	public boolean isCookable() {
		return true;
	}//override to change default value
	public static void testRabbit() {
		Rabbit r = new Rabbit("Bugs Bunny", 20.0);
		// getName is inherited from Mammal.
		System.out.println(r.getName() == "Bugs Bunny");
		System.out.println(r.getWeight() == 20.0);
		System.out.println(r.isCookable() == true);
	}
}	
