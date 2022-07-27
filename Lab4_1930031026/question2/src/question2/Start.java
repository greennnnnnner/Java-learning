package question2;

public class Start {
public static void main(String[] args) {
	Student.testStudent();//test\
	
	}
public static String check(Student s) {
	if(s.isSleeping()==true) {
		return "sweet dreams";
	}else {
		return "need coffee";
	}
}
}

