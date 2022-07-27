package question1;

public class Marathon extends Running{
	public Marathon(int playerNumber, double length) {
		super(playerNumber, length);
	}//constructor 1
	public Marathon(int playerNumber) {
		super(playerNumber, 42.195);
	}//constructor 2
	public static void testMarathon() {
		Marathon m1 = new Marathon(50,12.0);
		Marathon m2 = new Marathon(100);
		System.out.println(m1.getPlayerNumber()==50);
		System.out.println(m1.getLength()==12.0);
		System.out.println(m2.getPlayerNumber()==100);
		System.out.println(m2.getLength()==42.195);//test marathon class
	}
}
