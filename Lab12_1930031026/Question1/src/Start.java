	public class Start {
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					Model m = new Model();
					ControllerClicks c = new ControllerClicks(m);
					MyFrame mf = new MyFrame(m,c);
				}
			});
		}
	}