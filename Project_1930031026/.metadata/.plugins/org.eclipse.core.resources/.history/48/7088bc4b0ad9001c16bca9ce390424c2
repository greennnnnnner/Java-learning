import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class HistoryPanel extends JPanel{
	private Library m;
	public HistoryPanel(Library m) {
		this.m = m;
	}
	private int historyMax(ArrayList<Integer> h){
		int max = 0;//h.get(0);
		for(int i = 0;i<h.size();i++) {
			if(i == 0) {
				max = h.get(i);
			}else {
				if(h.get(i)<max) {
					max = h.get(i);
				}
			}
		}return max;
	}
	private int historyMin(ArrayList<Integer> h){
		int min = 0;
		for(int i = 0;i<h.size();i++) {
			if(i == 0) {
				min = h.get(i);
			}else {
				if(h.get(i)<min) {
					min = h.get(i);
				}
			}
		}return min;
	}
	private int historyRange(ArrayList<Integer> h) {
		int range = this.historyMax(h)-this.historyMin(h);
		if(range<10) {
			return 10;
		}else {
			return range;
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		ArrayList<Integer> history = m.getHistory();
		int min = historyMin(history);
		int range = historyRange(history);
		int maxX = getWidth() - 1;
		int maxY = getHeight() - 1;
		int zero = maxY + min * maxY / range;
		g.setColor(Color.BLUE);
		g.drawLine(0, zero, maxX, zero);//draw blue line
		g.setColor(Color.RED);
		if(history.size()==1) {
			g.drawRect(0,zero-history.get(0), 1, 1);
		}else{
			for(int i = 0; i<history.size()-1; i++) {
				g.drawLine(10*i, zero-history.get(i)*maxY/range, 10*(i+1),zero-history.get(i+1)*maxY/range);
			}//draw red lines
		}
	}
}
