
public class MajorRequired extends Course{
	public MajorRequired(String code, String title, MajorRequired preRequisite) {
		super(code, title, preRequisite);
	}
	public boolean isRequired() {
		return true;//is required for all students
	}
	public static void testMajorRequired() {
		//this function is empty because we cannot create any course object
	}
	
}
