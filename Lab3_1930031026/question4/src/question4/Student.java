package question4;

public class Student {
	private int ID;
	private String name; 
	private char grade;
	public Student(int ID, String name) {
		this.name=name;
		if(ID<0) {//decide if ID is less than 0
			this.ID = 0;
		}else{
			this.ID = ID;
		}
		this.grade='A';
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
	public char getGrade() {
		return this.grade;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public static void testStudent() {
		
		Student Student1 = new Student(12345678, "Tom");
		System.out.println(Student1.getID()==12345678&&Student1.getName()=="Tom"&&Student1.getGrade()=='A');//compare the id and name and grade of student
		
	}	
}
