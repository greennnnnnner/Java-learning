package question2;

public class Student {
	private int ID;
	public Student(int ID) {
		if(ID<0) {//decide if ID is less than 0
			this.ID = 0;
		}else{
			this.ID = ID;
		}
	}
	public int getID() {
		return this.ID;
	}
	public static void testStudent() {
		//case 1: when ID>=0
		Student Student1 = new Student(12345678);
		System.out.println(Student1.getID()==12345678);
		//case 2: when ID<0
		Student Student2 = new Student(-22);
		System.out.println(Student2.getID()==0);
	}	
}