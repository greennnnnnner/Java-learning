package question6;

public class Student {
	private int ID;
	private String name; 
	private char grade;
	private boolean sleeping;
	public Student(int ID, String name) {
		this.name=name;
		if(ID<0) {//decide if ID is less than 0
			this.ID = 0;
		}else{
			this.ID = ID;
		}
		this.grade='A';
		this.sleeping=false;
	}
	public Student(int ID, String name,char grade) {
		this.name=name;
		if(ID<0) {//decide if ID is less than 0
			this.ID = 0;
		}else{
			this.ID = ID;
		}
		this.grade=grade;
		this.sleeping=false;
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
	public boolean isSleeping() {
		return this.sleeping;
	}
	public void goToSleep() {
		this.sleeping=true;
		switch(this.grade){
		case 'A':
			this.grade='B';
			return;
		case 'B':
			this.grade='C';
			return;
		case 'C':
			this.grade='D';
			return;
		case 'D':
			this.grade='F';
			return;
		default:
			this.grade='F';
			return;//decrease the grade
		}
	}
	public void wakeUp() {
		this.sleeping=false;
	}
	
	public static void testStudent() {//test the new methods
		Student Student1 = new Student(12345678, "Tom");
		System.out.println(Student1.isSleeping()==false&&Student1.getGrade()=='A');//student default 
		Student1.goToSleep();
		System.out.println(Student1.isSleeping()==true&&Student1.getGrade()=='B');//fall in sleep and the grade decreased
		Student1.wakeUp();
		System.out.println(Student1.isSleeping()==false&&Student1.getGrade()=='B');//wake up and the grade stop decrease
	}
}