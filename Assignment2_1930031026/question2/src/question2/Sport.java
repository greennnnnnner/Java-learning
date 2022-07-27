package question2;

public class Sport {
	private int playerNumber;
	public Sport(int playerNumber) {
		this.playerNumber=playerNumber;
	}
	public int getPlayerNumber() {
		return this.playerNumber;
	}//return playerNumber
	public boolean isFun() {
		return false;
	}//the default isfun of sport class is false
	public static void testSport() {
		Sport s = new Sport(12);
		System.out.println(s.getPlayerNumber()==12);
		System.out.println(s.isFun()==false);//test the Sport class
	}
}
