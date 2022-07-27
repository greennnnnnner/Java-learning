
public class GUI {
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Library m = new Library("UIC Library");//as model
					ControllerGetBook c2 = new ControllerGetBook(m);
					ControllerSimple c1 = new ControllerSimple(m);
					ControllerMoreBook c3 = new ControllerMoreBook(m);
					ControllerCreate c4 = new ControllerCreate(m);
					ViewSimple v1 = new ViewSimple(m, c1);
					ViewGetBook v2 = new ViewGetBook(m,c2);
					ViewMoreBook v3 = new ViewMoreBook(m,c3);
					ViewCreate v4 = new ViewCreate(m,c4);
					m.addListener(v1);
					m.addListener(v2);
					m.addListener(v3);
					m.addListener(v4);
				}
			});
		}
	}