package question4;

public class Student {
	private String name;
	private Animal pet;
	public Student(String name, Animal pet){	
		this.name = name;
		this.pet = pet;
	}
	public String getName() {
		return this.name;
	}
	public Animal getPet() {
		return this.pet;
	}
	public static void testStudent(){
		Animal c = new Animal("Thing",2.0);
		//Cat c = new Cat("Meow",2.0);
		Student s = new Student("Bob", c );
		System.out.println(s.getName()=="Bob");
		System.out.println(s.getPet()==c);
	}
}
