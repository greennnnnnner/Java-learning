import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewMoreBook extends View<ControllerMoreBook>{
	private JTextField t1;
	private JTextField t2;
	public ViewMoreBook(Library m, ControllerMoreBook c) {
		super(m,c);
		this.setTitle("View Reset");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextField();
		t2 = new JTextField();
		JButton b1 = new JButton("More Book");
		
		GridLayout gl = new GridLayout(3,1);
	
		this.setLayout(gl);
		this.add(t1);
		this.add(t2);
		this.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(c.moreBook(t1.getText(),t2.getText())!="") {
					JOptionPane.showMessageDialog(null,c.moreBook(t1.getText(),t2.getText()),"Window Title" ,JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		this.setVisible(true);
	}
	@Override
	public void update() {
		//s does nothing, because the ViewMoreBook class does not graphically display any data from the library (the model).
		
	}
}
