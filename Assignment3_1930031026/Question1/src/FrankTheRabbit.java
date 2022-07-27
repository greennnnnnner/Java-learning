
public class FrankTheRabbit extends Rabbit{
	public FrankTheRabbit() {
		super("Frank", 100.0);
	}//constructor takes no arguments
	public boolean isCookable() {
		return false;
	}//override 
	public static void testFrankTheRabbit() {
		FrankTheRabbit ftr = new FrankTheRabbit();
		// getName is inherited from Mammal.
		System.out.println(ftr.getName() == "Frank");
		// getWeight is inherited from Rabbit.
		System.out.println(ftr.getWeight() == 100.0);
		// isCookable is from FrankTheRabbit itself.
		System.out.println(ftr.isCookable() == false);
	}
}
