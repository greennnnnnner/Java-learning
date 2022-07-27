import java.util.Scanner;

public class CLI {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Library l = new Library("UIC Library");
		while(true) {
		switch(readPosInt("Type an action (total:1 add:2 get:3 more:4 less:5 quit:6): ")) {
			case 1:
				System.out.println("Total number of borrowed books: "+l.totalBorrowedBooks());
				break;
			case 2:
				try{
					switch(readPosInt("Type the user role (lender:1 borrower: 2): ")) {
					case 1:
						Lender lender = new Lender(readLine("Enter the name of the user: "), readPosInt("Enter the initial number of borrowed books: "));
						l.addUser(lender);
						System.out.println("Lender \"" + lender.getName()+"\" lending " + (-lender.getBook()) + " book(s) has beed added");
						break;
					case 2:
						Borrower borrower = new Borrower(readLine("Enter the name of the user: "), readPosInt("Enter the initial number of borrowed books: "));
						l.addUser(borrower);
						System.out.println("Borrower \"" + borrower.getName()+"\" borrowing " + borrower.getBook() + " book(s) has beed added");
						break;
					default:
						System.out.println("Unknown user role!");
					}
					break;
				}catch(NotALenderException ex) {
					System.out.println("BUG! This must never happen!");//t the readPosInt method prevents the initial number of books from being negative, so the constructorfor the Borrower class will never throw a NotALenderException when you create a borrower object. 
					System.exit(1);
				}
			case 3:
				try {
					String name = readLine("Enter the name of the user: ");
					int book = l.getBook(name);
					System.out.println(name +" borrows "+book+ " book(s)");
					break;
				}catch(UnknownUserException ex) {
					System.out.println(ex.getMessage());
					break;
				}
			case 4:
				try{
					String name = readLine("Enter the name of the user: ");
					l.moreBook(name, readPosInt("Enter the number of books: "));
					break;
					}catch(UnknownUserException ex) {
						System.out.println(ex.getMessage());
						break;
					}catch(NotALenderException ex) {
						System.out.println("BUG! This must never happen!");//t the readPosInt method prevents the initial number of books from being negative, so the constructorfor the Borrower class will never throw a NotALenderException when you create a borrower object. 
						System.exit(1);
					}
			case 5:
				try {
					String name = readLine("Enter the name of the user: ");
					l.moreBook(name, -readPosInt("Enter the number of books: "));
					break;
					}catch(UnknownUserException ex) {
						System.out.println(ex.getMessage());
						break;
					}catch(NotALenderException ex) {
						System.out.println("BUG! This must never happen!");//t the readPosInt method prevents the initial number of books from being negative, so the constructorfor the Borrower class will never throw a NotALenderException when you create a borrower object. 
						System.exit(1);
					}
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}
	private static String readLine(String string) {
		System.out.print(string);//print this string on the screen
		return input.nextLine();
	}
	private static int readPosInt(String string) {
		while(true){
			System.out.print(string);
		try{
			if(input.hasNextInt()) {
				int ni = input.nextInt();
				input.nextLine();
				if(ni>=0) {
					return ni;
				}else {
					System.out.println("Positive integers only");
				}
				
			}else {
				throw new InputMismatchException("You must type an integer!");
			}
		}
		catch(InputMismatchException ex){
			System.out.println(ex.getMessage());
			input.nextLine();
			}
		}
		
	}
	
	
	
}
