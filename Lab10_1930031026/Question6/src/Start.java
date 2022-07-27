import javax.swing.*;

//If add another MyFrame object, there will be 2 windows
//both will be closed after clicking on close

class MyThread implements Runnable{
	@Override
	public void run() {
		new MyFrame();
		//new MyFrame();
	}
}

public class Start{
	public static void main(String[] args) {
		MyThread mf = new MyThread();
		SwingUtilities.invokeLater(mf);
	}
	
}
