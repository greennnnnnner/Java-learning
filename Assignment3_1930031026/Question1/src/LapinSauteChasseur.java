
public class LapinSauteChasseur extends EuropeanRabbit{
	public LapinSauteChasseur() {
		super("Delicious", 0.5);
	}//constructor takes no argument
	public static void testLapinSauteChasseur() {
		LapinSauteChasseur lsc = new LapinSauteChasseur();
		// getName is inherited from Mammal.
		System.out.println(lsc.getName() == "Delicious");
		// getWeight is inherited from Rabbit.
		System.out.println(lsc.getWeight() == 0.5);
		// isCookable is inherited from Rabbit.
		System.out.println(lsc.isCookable() == true);
	}
}
