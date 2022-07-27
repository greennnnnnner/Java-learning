
public class Square extends Rectangle{
	public Square(double x, double y, double size){
		super(x,y,size,size);
	}
	//don't need own area and resize methods
	public static void testSquare() {
		Square s = new Square(1.2, 3.4, 5.0);
		// getX, getY, and move are inherited from Shape.
		// area and resize are inherited from Rectangle.
		System.out.println(s.getX() == 1.2);
		System.out.println(s.getY() == 3.4);
		System.out.println(s.area() == 25.0);
		// Move the square.  The area does not change.
		s.move(7.8, 9.0);
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 25.0);
		// Resize the square.  The area changes but not the position.
		s.resize(12.0);
		System.out.println(s.getX() == 9.0);
		System.out.println(s.getY() == 12.4);
		System.out.println(s.area() == 144.0);
	}


}
