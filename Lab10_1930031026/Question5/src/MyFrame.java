
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("MyFrame");//comment this out then the title will be empty
		this.setSize(400, 300);//comment this out then the window will be shown in a very small size
		this.setLocation(600, 300);//
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);//the program will keep running after quiting if we comment this line out
		this.setLocationRelativeTo(null);//location changed to center after adding this function
		
		JButton a = new JButton("buttonA");
		JButton b = new JButton("buttonB");
		
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		jp1.setLayout(new BorderLayout());
		this.add(jp1, BorderLayout.PAGE_START);
		jp1.add(a,BorderLayout.LINE_START);
		jp1.add(b, BorderLayout.LINE_END);
		jp1.setBackground(Color.BLUE);
		this.add(jp2, BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());
		jp2.setBackground(Color.GREEN);
		jp2.add(l);
		jp2.add(tx);
		this.add(jp3,BorderLayout.PAGE_END);
		jp3.setLayout(new GridLayout(2,2));
		jp3.add(cb);
		jp3.add(rb);
		jp3.add(cb1);
		jp3.add(cb2);
		//the components will keep small after resizing the window very big
		this.setVisible(true);//the window will be invisible if comment this line out
	}
}
