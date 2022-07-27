
public class Base {
	private String code;
	private String title;
	public Base(String code, String title) {
		this.code = code;
		this.title = title;
	}
	public String getCode() {
		return this.code;
	}
	public String getTitle() {
		return this.title;
	}
	public Base getPreRequisite() {
		return this;//return base class itself since it don't have prerequisite course 
	}
	public static void testBase() {//test base class
		Base b = new Base("DS1001", "EntryCourse"); 
		System.out.println(b.getCode() == "DS1001"); 
		System.out.println(b.getTitle() == "EntryCourse"); 
		System.out.println(b.getPreRequisite() == b); 
	}
}
