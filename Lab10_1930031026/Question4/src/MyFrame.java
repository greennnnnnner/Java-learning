
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
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
		//this.add(a);
		this.add(a,BorderLayout.PAGE_START);
		this.add(b,BorderLayout.PAGE_START);//button a will be covered by b
		//this.setLayout(new GridLayout(5,5,60,20));
		// the program doesn't use the number of rows I specified.the program doesn't use the number of columns that I specified
		//LAYOUT changes when using mouse resize the frame
		
		
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[]{2, 7, -3, 24});
		this.add(l,BorderLayout.LINE_START);
		this.add(tx,BorderLayout.LINE_END);
		this.add(cb,BorderLayout.CENTER);//if a area doesn't have component, nothing will be shown there
		this.add(rb);
		this.add(cb1);
		this.add(cb2);
		//resizing the window will make all components automatically reorganize
		this.setVisible(true);//the window will be invisible if comment this line out
	}
}
