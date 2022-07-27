
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewGetBook extends View<ControllerGetBook>{
	private JTextField t;
	public ViewGetBook(Library m, ControllerGetBook c){
		super(m,c);
		this.setTitle("View Reset");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t = new JTextField();
		JButton b1 = new JButton("Tell me the book number");
		GridLayout gl = new GridLayout(2,1);
	
		this.setLayout(gl);
		this.add(t);
		this.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,c.getBook(t.getText()),"Window Title" ,JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.setVisible(true);
	}
	public void update() {
		//does nothing, because the ViewGetBook class does not graphically display any data from the library (the model).
	}
}
