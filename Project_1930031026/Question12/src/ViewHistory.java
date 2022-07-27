import javax.swing.JFrame;

public class ViewHistory extends View<ControllerHistory>{
	public ViewHistory(Library m, ControllerHistory c) {
		super(m,c);
		this.setTitle("MoreBook");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new HistoryPanel(m));
		this.setVisible(true);
	}

	@Override
	public void update() {
		repaint();
	}
}
