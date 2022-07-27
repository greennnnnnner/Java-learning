public interface IUser {//interface of user
	public String getName();
	public int getBook();
	public void moreBook(int number) throws NotALenderException;
}
