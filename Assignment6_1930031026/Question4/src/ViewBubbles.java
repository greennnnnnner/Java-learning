import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ViewBubbles extends JPanel{
	private Model model;
	public ViewBubbles(Model model) {
		this.model = model;
		this.addMouseListener(new MouseAdapter() {
			// If the user clicks somewhere with the mouse:
			@Override
			public void mouseClicked(MouseEvent e) {
				clickBubbles(e.getX(), e.getY());

			}
		});
		Timer t = new Timer(500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moveUp(getWidth(), getHeight());//move bubbles with time changed
			}
		});
			//start the timer!
		t.start();
	}//constructor
	private void moveUp(int w, int h) {
		model.moveAll(0, -1);//move all bubbles by 1 pixel
		int temp = model.getScore();//save score before clearing invisible bubbles
		model.clearInvisibles(w, h);//clear invisible bubbles
		model.addBubble(w, h);//add a new bubble
		if(temp != model.getScore()) {
			System.out.println(model.getScore());//print score
		}
		repaint();
	}
	private void clickBubbles(int x, int y) {
		int temp = model.getScore();
		model.deleteBubblesAtPoint(x, y);// delete all the bubbles which contain the point where the mouse was clicked
		if(temp!=model.getScore()) {
			System.out.println(model.getScore());
		}
		repaint();
	}
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(),getHeight() );//clear all bubbles before repaint them
		model.drawAll(g);
	}
	
	
}
