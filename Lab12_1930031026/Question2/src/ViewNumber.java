
import java.awt.GridLayout;
import javax.swing.JLabel;
public class ViewNumber extends View<Controller>{
	private JLabel label;
	public ViewNumber(Model m, Controller c) {
		super(m, c);
		this.setTitle("Point Number");
		this.setSize(150, 150);
		this.setLayout(new GridLayout(2, 1));
		label = new JLabel();
		update();
		this.add(label);
		this.setVisible(true);
	}
	@Override
	public void update() {
		label.setText("The number of points is: "+ m.numberOfPoints());
	}
	
}
