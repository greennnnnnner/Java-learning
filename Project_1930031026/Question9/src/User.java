
public abstract class User implements IUser{
	private String name;
	private int book;
	public User(String name, int book) {
		this.name = name;
		this.book = book;
	}
	public String getName() {
		return this.name;
	}
	public int getBook() {
		return this.book;
	}
	protected void setBook(int book) {
		this.book = book;
	}
	public abstract void moreBook(int number) throws NotALenderException;
	
	public static void testUser() {
		//this class is an abstract class, no test can be excuted
	}
}
