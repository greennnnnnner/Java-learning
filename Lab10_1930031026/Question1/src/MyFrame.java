
import javax.swing.JFrame;
public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("MyFrame");//comment this out then the title will be empty
		this.setSize(400, 300);//comment this out then the window will be shown in a very small size
		this.setLocation(600, 300);//
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);//the program will keep running after quiting if we comment this line out
		this.setLocationRelativeTo(null);//location changed to center after adding this function
		this.setVisible(true);//the window will be invisible if comment this line out
		
	}
}
