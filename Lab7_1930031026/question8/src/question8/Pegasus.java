package question8;

public class Pegasus extends Bird{
	public Pegasus(String name) {
		super(name,0);
	}
	public int getLegs() {
		return 4;
	}
	public int getNumOfEggs() {
		System.out.println("Pegasi do not lay eggs!");
		return 0;
	}
	public static void testPegasus() {
		Pegasus p = new Pegasus("pega");
		System.out.println(p.getName()=="pega");
		System.out.println(p.canFly()==true);
		System.out.println(p.getNumOfEggs()==0);
		System.out.println(p.getLegs()==4);
	}
}
