
public class Course implements Learnable{
	private String code;
	private String title;
	private Learnable preRequisite;//set private variables
	public Course(String code, String title, Learnable preRequisite) {
		this.code = code;
		this.title = title;
		if(preRequisite==null) {
			System.out.println("pre-requisite course cannot be null!");
		}
		this.preRequisite = preRequisite;//constructor
	}
	public String getCode() {
		return this.code;
	}
	public String getTitle() {
		return this.title;
	}
	public Learnable getPreRequisite() {
		return this.preRequisite;
	}
	public boolean isRequired() {
		//default value is true
		return true;
	}
	public static void testCourse() {
		//this function is empty because we cannot create any course object
	}
}
