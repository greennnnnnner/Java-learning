import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<IUser> users;
	private ArrayList<ModelListener> listeners;
	private ArrayList<Integer> history;
	public Library(String name) {//constructor
		this.name = name;
		users = new ArrayList<IUser>();//create a empty new arraylist
		listeners = new ArrayList<ModelListener>();
		history = new ArrayList<Integer>();
		history.add(0);
	}
	public void addUser(IUser user) {
		this.users.add(user);//add member to arraylist
		int i = totalBorrowedBooks();
		history.add(i);
		notifyListeners();
		
	}
	public int totalBorrowedBooks() {
		int total = 0;
		for(IUser u : this.users) {//enhanced loop
			total += u.getBook();
		}//add all users's books together
		return total;
	}
	public int getBook(String name) throws UnknownUserException {
		for(IUser u: this.users) {
			if(u.getName().equals(name)) {    
				return u.getBook();
			}
		}throw new UnknownUserException("User "+name+" unknown.");
	}
	public void moreBook(String name, int number) throws UnknownUserException, NotALenderException {
		for(IUser u : this.users) {
			if(u.getName().equals(name)) {
				u.moreBook(number);
				int i = totalBorrowedBooks();
				history.add(i);
				notifyListeners();
				
				return;
			}
		}throw new UnknownUserException("User " +name+ " unknown.");
	}
	public void addListener(ModelListener ml){
		this.listeners.add(ml);
	}
	private void notifyListeners() {
		for(ModelListener ml: listeners) {
			ml.update();
		}
	}
	
	public ArrayList<Integer> getHistory(){
		return this.history;
	}
	
	public static void testLibrary() {
		Library li = new Library("UIC Library");
		System.out.println(li.totalBorrowedBooks() == 0);
		Lender L1 = new Lender("L1", 10);
		li.addUser(L1);
		try {
		System.out.println(li.getBook("L1") == -10);
		System.out.println(li.totalBorrowedBooks() == -10);
		li.addUser(new Borrower("B1", 20));
		System.out.println(li.getBook("L1") == -10);
		System.out.println(li.getBook("B1") == 20);
		System.out.println(li.totalBorrowedBooks() == 10);
		L1.moreBook(10);
		System.out.println(li.getBook(L1.getName())==-20);
		li.getBook("B2");
		
		
		} catch(UnknownUserException ex) {
		System.out.println(ex.getMessage().equals("User B2 unknown."));
		} catch(NotALenderException ex) {
		// This should never happen!
		System.out.println(false);
		}
		
	}
}