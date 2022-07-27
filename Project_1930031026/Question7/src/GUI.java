
public class GUI {
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Library m = new Library("UIC Library");
					ControllerSimple c = new ControllerSimple(m);
					ViewSimple v = new ViewSimple(m, c);
				}
			});
		}
	}