public class Start {
	public static void main(String[] args) {
		Shape.testShape();
		Bubble.testBubble();
		Model.testModel();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		});
	}
}

