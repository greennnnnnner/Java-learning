
public class Start {
	public static void main(String[] args) {
		Shape.testShape();
		Circle.testCircle();
		Dot.testDot();
		//A undefined cannot be resized, should throw an exception
		Rectangle.testRectangle();
		Square.testSquare();
	}
	
	//Circle's resize includes no exception so no need to change it
}
