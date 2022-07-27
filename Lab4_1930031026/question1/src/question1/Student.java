package question1;

public class Student {
	private int ID;
	private boolean sleeping=false;
	public Student(int ID) {
		this.ID=ID;//input the ID of student
	}
	public int getID() {
		return this.ID;//get the ID of student
	}
	public boolean  isSleeping() {
		 return this.sleeping;//get the status of sleeping
	}
	public void fallAsleep() {
		this.sleeping = true;//change sleeping to false
	}
	public void wakeUp() {
		this.sleeping = false;//change sleeping to true
	}
	public static void testStudent() {
		Student s = new Student(1234567890);
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep(); // should do nothing because the student is already sleeping
		System.out.println(s.isSleeping() == true);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp(); // should do nothing because the student is already awake
		System.out.println(s.isSleeping() == false);
	}
}		
