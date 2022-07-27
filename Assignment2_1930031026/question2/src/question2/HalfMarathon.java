package question2;

public class HalfMarathon extends Marathon{
	public HalfMarathon() {
		super(99, 21.0975);
	}
	public static void testHalfMarathon() {
		HalfMarathon h = new HalfMarathon();
		System.out.println(h.getPlayerNumber()==99);
		System.out.println(h.getLength()==21.0975);//test halfMarathon class
	}
}
