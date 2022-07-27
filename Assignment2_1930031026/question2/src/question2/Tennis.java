package question2;

public class Tennis extends Sport{
	public Tennis(){
		super(2);//set playerNumbers equal to 2
	}
	public boolean isFun() {
		return true;//override isFun to make Tennis.isFun return to ture
	}
	public static void testTennis() {
		Tennis t = new Tennis();
		System.out.println(t.getPlayerNumber()==2);//test t's playernumber
		System.out.println(t.isFun()==true);
	}
}
