package question4;

public class Bird extends Animal{
	private int numOfEggs;
	public Bird(String name, int numOfEggs) {
		super(name);
		this.numOfEggs = numOfEggs;
	}
	
	public int getNumOfEggs() {
		return this.numOfEggs;
	}
	public int getLegs() {
		return 2;
	}
	public boolean canFly() {
		return true;
	}
	public static void testBird() {
		Bird b = new Bird("bird", 2);
		System.out.println(b.getName()=="bird");
		System.out.println(b.getNumOfEggs()==2);
		System.out.println(b.getLegs()==2);
		System.out.println(b.canFly()==true);
	}
}
