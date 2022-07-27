package question3;

public class Student {
	private int ID;
	private String name; 
	public Student(int ID, String name) {
		this.name=name;
		if(ID<0) {//decide if ID is less than 0
			this.ID = 0;
		}else{
			this.ID = ID;
		}
	}
	public int getID() {
		return this.ID;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void testStudent() {
		
		Student Student1 = new Student(12345678, "Tom");
		System.out.println(Student1.getID()==12345678&&Student1.getName()=="Tom");//compare the id and name of student
		Student1.setName("NewTom");
		System.out.println(Student1.getName()=="NewTom");//change the name and check the new name
	}	
}
