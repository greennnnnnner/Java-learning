import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewCreate extends View<ControllerCreate>{
	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;
	public ViewCreate(Library m, ControllerCreate c) {
		super(m,c);
		String[] options = {
				"Lender",
				"Borrower"
		};
		this.setTitle("View Create");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextField();
		t2 = new JTextField();
		cb = new JComboBox<String>(options);
		JButton b1 = new JButton("Create");
		      
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = (String) cb.getSelectedItem();
				if(s.equals("Lender")) {
				if(c.create(t1.getText(),t2.getText(),0 )=="") {
					//c.create(t1.getText(), t2.getText(), 0);
				}else{
					JOptionPane.showMessageDialog(null,c.create(t1.getText(),t2.getText(),0),"Window Title" ,JOptionPane.INFORMATION_MESSAGE);
				}
				}else if(s.equals("Borrower")){
					if(c.create(t1.getText(),t2.getText(),1 )=="") {
    					//c.create(t1.getText(), t2.getText(), 1);
    				}else {JOptionPane.showMessageDialog(null,c.create(t1.getText(),t2.getText(),1),"Window Title" ,JOptionPane.INFORMATION_MESSAGE);
    				}
				}
			}});
	
		  
		
		
		GridLayout gl = new GridLayout(4,1);
		this.setLayout(gl);
		this.add(t1);
		this.add(t2);
		this.add(cb);
		this.add(b1);
		
		this.setVisible(true);
	}
	@Override
	public void update() {
		
	}
}