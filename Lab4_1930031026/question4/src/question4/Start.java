package question4;


public class Start {
public static void main(String[] args) {
	Chicken.testChicken();//test\
	
	}
public static String check(Chicken c) {
	if(c.isSleeping()==true) {
		return "sweet dreams";
	}else {
		return "need coffee";
	}
}
}