package question7;

public class LivingThing {
	private String name;
	public LivingThing(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public static void testLivingThing(){
		LivingThing lt = new LivingThing("thing");
		System.out.println(lt.getName()=="thing");
	}
}
