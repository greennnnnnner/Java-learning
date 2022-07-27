import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel{
	public MyPanel(LayoutManager layout) {
		super(layout);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawString("hello",20,80);
		g.drawString("hello",
				(int)Math.round(Math.random() * this.getWidth()),
				(int)Math.round(Math.random() * this.getHeight()));

	}
	public MyPanel() {
		
	}
}
