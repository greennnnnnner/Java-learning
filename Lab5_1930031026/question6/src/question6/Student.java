package question6;

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
		Bird b = new Bird("Thing",2.0,9.0);
		Student s = new Student("Bob", b );
		System.out.println(s.getName()=="Bob");
		System.out.println(s.getPet()==b);
	}
}
