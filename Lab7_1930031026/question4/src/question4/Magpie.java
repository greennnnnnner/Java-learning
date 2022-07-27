package question4;

public class Magpie extends Bird{
	public Magpie(String name) {
		super(name,6);
	}
	public static void testMagpie() {
		Magpie m = new Magpie("mag");
		System.out.println(m.getName()=="mag");
		System.out.println(m.getNumOfEggs()==6);
		System.out.println(m.canFly()==true);
	}

}
