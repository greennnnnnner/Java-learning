
public class GUI {
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Library m = new Library("UIC Library");//as model
					m.addUser(new Lender("Anna", 5));
					try {
						m.addUser(new Borrower("Bob", 10));
					} catch (NotALenderException e) {
					}
					ControllerGetBook c2 = new ControllerGetBook(m);
					ControllerSimple c1 = new ControllerSimple(m);
					ViewSimple v1 = new ViewSimple(m, c1);
					ViewGetBook v2 = new ViewGetBook(m,c2);
				
					m.addListener(v1);
					m.addListener(v2);
					
				}
			});
		}
	}