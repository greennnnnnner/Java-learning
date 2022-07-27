package question9;

public class Start {
	public static void main(String[] args) {
		Flyer m = new Magpie("mag");
		System.out.println(m.canFly()==true);
		Flyer o = new Ostrich("os");
		System.out.println(o.canFly()==false);
		Flyer p = new Pegasus("pe");
		System.out.println(p.canFly()==true);
		Flyer a = new Airplane("airp");
		System.out.println(a.getName()=="airp");
		System.out.println(a.canFly()==true);
		
		System.out.println(m.isDangerous()==false);
		System.out.println(o.isDangerous()==true);
		System.out.println(p.isDangerous()==false);
		System.out.println(a.isDangerous()==false);
	}//classes use Flyer interface need to be changed,otherwise not
}
