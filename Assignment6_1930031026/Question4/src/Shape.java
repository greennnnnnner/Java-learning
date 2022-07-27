import java.awt.Color;
import java.awt.Graphics;
public abstract class Shape implements IShape{
	private int x;
	private int y;
	private Color color;
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;//constructor
		this.color = new Color((float)Math.random(),(float)Math.random(),(float)Math.random());//make a random color
	}
	public int getX() {
		return this.x;//getter of x
	}
	public int getY() {
		return this.y;//getter of y
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public abstract boolean isVisible(int w, int h);
	public abstract boolean isIn(int x, int y);
	public void draw(Graphics g) {
		g.setColor(color);//set color
	}
	public static void testShape() {
		//The Shape class is abstract. We cannot create objects from this class. Therefore, we cannot test anything
	}
}
