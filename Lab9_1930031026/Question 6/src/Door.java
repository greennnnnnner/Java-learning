
public class Door {
	private boolean isOpen;
	public Door() {//constructor
		this.isOpen=false;//default closed door
	}
	public boolean isOpen() {
		return this.isOpen;
	}
	public void open() {
		this.isOpen=true;//open the door
	}
	public void close() {
		this.isOpen=false;//close the door
	}
public static void testDoor() {//test this class
	Door d = new Door();
	System.out.println(d.isOpen() == false);
	d.close();
	System.out.println(d.isOpen() == false);
	d.open();
	System.out.println(d.isOpen() == true);
	}
}
