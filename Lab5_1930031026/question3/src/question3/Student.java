package question3;

public class Student {
	private String name;
	private Cat pet;
	public Student(String name, Cat pet){	
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return this.name;
	}
	public Cat getPet() {
		return this.pet;
	}
	public static void testStudent(){
		Cat c = new Cat("Meow",2.0);
		Student s = new Student("Bob", c );
		System.out.println(s.getName()=="Bob");
		System.out.println(s.getPet()==c);
	}
}
