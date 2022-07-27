package question7;

public class Ostrich extends Bird{
	public Ostrich(String name) {
		super(name, 10);
	}
	public boolean canFly() {
		return false;
	}
	public static void testOstrich() {
		Ostrich o = new Ostrich("os");
		System.out.println(o.getName()=="os");
		System.out.println(o.getNumOfEggs()==10);
		System.out.println(o.canFly()==false);
		System.out.println(o.getLegs()==2);
	}
	
}
