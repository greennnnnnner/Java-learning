
public class Human extends Mammal{
	public Human(){
		super("Alice");//super constructor, all human are named Alice
	}
	public boolean isCookable() {
		return false;//override to avoid printing mesage
	}
	public static void testHuman() {
		Human h = new Human();
		// getName is inherited from Mammal.
		System.out.println(h.getName() == "Alice");
		System.out.println(h.isCookable() == false);  // No message printed.
	}
}
