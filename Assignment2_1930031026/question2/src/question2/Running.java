package question2;

public class Running extends Sport{
	private double length;
	public Running(int playerNumber, double length) {
		super(playerNumber);
		this.length=length;
	}
	public double getLength(){
		return this.length;
	}
	//running is not fun, so follows the uppercase Sport's default value\
	public static void testRunning(){
		Running r = new Running(1, 1000.0);
		System.out.println(r.getPlayerNumber()==1);
		System.out.println(r.getLength()==1000.0);
		
	}
}
