
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("MyFrame");//comment this out then the title will be empty
		this.setSize(400, 300);//comment this out then the window will be shown in a very small size
		this.setLocation(600, 300);//
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);//the program will keep running after quiting if we comment this line out
		this.setLocationRelativeTo(null);//location changed to center after adding this function
		
		JButton a = new JButton("buttonA");
		JButton b = new JButton("buttonB");
		this.add(a);
		this.add(b);//only button b is shown at first
		//it adding one button twice, only one will be shown
		FlowLayout f1 = new FlowLayout();
		f1.setHgap(20);
		f1.setVgap(60);
		f1.setAlignment(FlowLayout.LEFT);
		this.setLayout(f1);
		this.setVisible(true);//the window will be invisible if comment this line out
	}
}
