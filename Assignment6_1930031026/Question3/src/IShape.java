import java.awt.Graphics;

public interface IShape {
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public boolean isVisible(int w, int h);
	public boolean isIn(int x, int y);
	public void draw(Graphics g);
	
}
