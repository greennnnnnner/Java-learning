package question7;

public class Start {
	public static void main(String[] args) {
		Flyer m = new Magpie("mag");
		System.out.println(m.canFly()==true);
		Flyer o = new Ostrich("os");
		System.out.println(o.canFly()==false);
		Flyer p = new Pegasus("pe");
		System.out.println(p.canFly()==true);
		
	}//Animal. Dog or Bird classes can not be tested through the Flyer interface, because interface cannot be initialized
}
