import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private int x = -1;
	private int y = -1;
	public static void main(String[] args)
	{	
		MyFrame MF = new MyFrame();
		MF.addMouseListener(new MyMouseListener());
	}
}
 