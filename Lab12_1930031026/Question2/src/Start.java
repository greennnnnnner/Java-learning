	public class Start {
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Model m = new Model();
					Controller c0 = new Controller(m);
					ControllerClicks c1 = new ControllerClicks(m);
					MyFrame mf = new MyFrame(m,c1);
					ViewNumber v = new ViewNumber(m,c0);
				}
			});
		}
	}