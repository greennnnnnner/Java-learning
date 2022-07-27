
public class EuropeanRabbit extends Rabbit{//Inherent from rabbit class
	public EuropeanRabbit(String name, double weight) {
		super(name, weight);
	}//constructor one
	public EuropeanRabbit(String name) {
		this(name, 2.0);
	}//constructor two, uses first constructor one
	public static void testEuropeanRabbit() {
		// Testing the first constructor.
		EuropeanRabbit er1 = new EuropeanRabbit("black bunny", 3.0);
		// getName is inherited from Mammal.
		System.out.println(er1.getName() == "black bunny");
		// getWeight is inherited from Rabbit.
		System.out.println(er1.getWeight() == 3.0);
		// isCookable is inherited from Rabbit.
		System.out.println(er1.isCookable() == true);
		// Testing the second constructor.
		EuropeanRabbit er2 = new EuropeanRabbit("white rabbit");
		// getName is inherited from Mammal.
		System.out.println(er2.getName() == "white rabbit");
		// getWeight is inherited from Rabbit.
		System.out.println(er2.getWeight() == 2.0);
		// isCookable is inherited from Rabbit.
		System.out.println(er2.isCookable() == true);
	}

}
