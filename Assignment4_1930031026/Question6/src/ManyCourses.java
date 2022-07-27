import java.util.ArrayList;
import java.util.Iterator;

public class ManyCourses {
	private ArrayList Courses;
	public ManyCourses(){
		this.Courses = new ArrayList();//constructor
		//creating a new ArrayList
	}
	public void addCourse(Learnable c) {
		this.Courses.add(c);//add a learnable to list
	}
	public void listCourses() {
		for(Object c: this.Courses) {//use enhanced loop
			Learnable l = (Learnable) c;
			System.out.println(l.getCode()+", "+l.getTitle());//print information one by one
			
		}
	}
	public static void testManyCourses() {
		Base b = new Base("DS1001","EntryCourse");
		MajorRequired mr1 = new MajorRequired("DS200X","OOP",b);
		MajorElective me1 = new MajorElective("DS300X","Data Mining",mr1);
		ManyCourses mc = new ManyCourses();
		mc.addCourse(b);
		mc.addCourse(mr1);
		mc.addCourse(me1);
		mc.listCourses();
	}
}
