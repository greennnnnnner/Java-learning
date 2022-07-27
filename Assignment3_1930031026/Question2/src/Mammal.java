
public class Mammal {
	private String name;
	public Mammal(String name) {
		this.name = name;
	}//constructor
	public String getName() {
		return this.name;
	}//return to the name of object
	public boolean isCookable() {
		System.out.println("Do not cook this!");//send a message
		return false;//default return value is false			
	}
	public static void testMammal() {
		Mammal m = new Mammal("some name");
		System.out.println(m.getName() == "some name");
		System.out.println(m.isCookable() == false); // Message printed too.
	}
}
