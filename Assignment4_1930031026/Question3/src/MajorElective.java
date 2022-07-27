
public class MajorElective extends Course{
	public MajorElective(String code, String title, MajorRequired preRequisite) {
		super(code, title, preRequisite);
	}
	public boolean isRequired() {
		return false;//change default value
	}
	public static void testMajorElective() {
		//Since we cannot create any MajorElective object, 
				//the testMajorElective method of the Course class must be empty.
	}
}
