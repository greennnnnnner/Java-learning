
public class Lender extends User{
	public Lender(String name, int book) {
		super(name, -book);
		
	}
	@Override
	public void moreBook(int number) {
		super.setBook(super.getBook()-number);//lender user increase lent books
	}
	public static void testLender()
	{
		Lender l = new Lender("Anna",5);
		System.out.println(l.getName() == "Anna");
		System.out.println(l.getBook() == -5);
		l.setBook(-6);
		System.out.println(l.getBook() == -6);
		l.moreBook(2);
		System.out.println(l.getBook() == -8);
		l.moreBook(-9);
		System.out.println(l.getBook() == 1);
	}

}
