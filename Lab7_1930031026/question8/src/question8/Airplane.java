package question8;

public class Airplane implements Flyer{
	private String name;
	public Airplane(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean canFly() {
		return true;
	}
}
