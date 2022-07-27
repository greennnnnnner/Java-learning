package question8;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	public int getLegs() {
		return 4;
	}
	public boolean canFly() {
		return false;
	}
	public static void testDog() {
		Dog d = new Dog("puppy");
		System.out.println(d.getName()=="puppy");
		System.out.println(d.getLegs()==4);
		System.out.println(d.canFly()==false);
	}
	
}
