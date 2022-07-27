import java.awt.Graphics;

public class Bubble extends Shape{
	private double radius;//represents the radius of the bubble
	public Bubble(int x, int y) {
		super(x,y);
		this.radius = 10;
	}
	// Find the point (wx, wy) inside the window which is closest to the
	// center (x, y) of the circle. In other words, find the wx in the
	// interval [0, w - 1] which is closest to x, and find the wy in the
	// interval [0, h - 1] which is closest to y.
	// If the distance between (wx, wy) and (x, y) is less than the radius
	// of the circle (using Pythagoras's theorem) then at least part of
	// the circle is visible in the window.
	// Note: if the center of the circle is inside the window, then (wx, wy)
	// is the same as (x, y), and the distance is 0.
	public boolean isVisible(int w, int h) {
		double x = getX();
		double y = getY();
		double wx = (x < 0 ? 0 : (x > w - 1 ? w - 1 : x));
		double wy = (y < 0 ? 0 : (y > h - 1 ? h - 1 : y));
		double dx = wx - x;
		double dy = wy - y;
		return dx * dx + dy * dy <= radius * radius;
	}
	public boolean isIn(int x, int y) {
		return radius*radius >= (x-this.getX())*(x-this.getX())+(y-this.getY())*(y-this.getY());
	}//use Pythagoras's theorem to calculate if x,y is inside the bubble
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(this.getX(), this.getY(), (int)radius, (int)radius);//cast radius from double to integers
	}//draw the bubbles
	public static void testBubble() {
		Bubble b = new Bubble(20, 30);
		System.out.println(b.getX() == 20);
		System.out.println(b.getY() == 30);
		b.setX(40);
		System.out.println(b.getX() == 40);
		System.out.println(b.getY() == 30);
		b.setY(60);
		System.out.println(b.getX() == 40);
		System.out.println(b.getY() == 60);
		// circle fully inside window
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window top edge
		b.setX(50);
		b.setY(0);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window right edge
		b.setX(99);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window bottom edge
		b.setX(50);
		b.setY(99);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window left edge
		b.setX(0);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window top left corner
		b.setX(0);
		b.setY(0);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window top right corner
		b.setX(99);
		b.setY(0);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window bottom right corner
		b.setX(99);
		b.setY(99);
		System.out.println(b.isVisible(100, 100) == true);
		// circle center on window bottom left corner
		b.setX(0);
		b.setY(99);
		System.out.println(b.isVisible(100, 100) == true);
		// circle bottom edge on window top edge
		b.setX(50);
		b.setY(-10);
		System.out.println(b.isVisible(100, 100) == true);
		// circle left edge on window right edge
		b.setX(109);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == true);
		// circle top edge on window bottom edge
		b.setX(50);
		b.setY(109);
		System.out.println(b.isVisible(100, 100) == true);
		// circle right edge on window left edge
		b.setX(-10);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == true);
		// circle bottom right edge on window top left corner
		b.setX(-7);
		b.setY(-7);
		System.out.println(b.isVisible(100, 100) == true);
		// circle bottom left edge on window top right corner
		b.setX(106);
		b.setY(-7);
		System.out.println(b.isVisible(100, 100) == true);
		// circle top left edge on window bottom right corner
		b.setX(106);
		b.setY(106);
		System.out.println(b.isVisible(100, 100) == true);
		// circle top right edge on window bottom left corner
		b.setX(-7);
		b.setY(106);
		System.out.println(b.isVisible(100, 100) == true);
		// circle bottom edge beyond window top edge
		b.setX(50);
		b.setY(-11);
		System.out.println(b.isVisible(100, 100) == false);
		// circle left edge beyond window right edge
		b.setX(110);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == false);
		// circle top edge beyond window bottom edge
		b.setX(50);
		b.setY(110);
		System.out.println(b.isVisible(100, 100) == false);
		// circle right edge beyond window left edge
		b.setX(-11);
		b.setY(50);
		System.out.println(b.isVisible(100, 100) == false);
		// circle bottom right edge beyond window top left corner
		b.setX(-8);
		b.setY(-8);
		System.out.println(b.isVisible(100, 100) == false);
		// circle bottom left edge beyond window top right corner
		b.setX(107);
		b.setY(-8);
		System.out.println(b.isVisible(100, 100) == false);
		// circle top left edge beyond window bottom right corner
		b.setX(107);
		b.setY(107);
		System.out.println(b.isVisible(100, 100) == false);
		// circle top right edge beyond window bottom left corner
		b.setX(-8);
		b.setY(107);
		System.out.println(b.isVisible(100, 100) == false);
		b.setX(0);
		b.setY(0);
		System.out.println(b.isIn(2, 2) == true);
		System.out.println(b.isIn(10, 0) == true);
		System.out.println(b.isIn(0, 10) == true);
		System.out.println(b.isIn(7, 7) == true);
		System.out.println(b.isIn(11, 0) == false);
		System.out.println(b.isIn(0, 11) == false);
		System.out.println(b.isIn(8, 8) == false);
	}	

}
