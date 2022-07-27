package question6;
import java.util.ArrayList;
public class ManyShapes {
	private ArrayList<Shape> allShapes;
	public ManyShapes() {
		this.allShapes = new ArrayList<Shape>();
		
	}
	public void addShape(Shape s) {
		this.allShapes.add(s);
	}
	public void listAllShapes() {
		for(int i=0;i<=this.allShapes.size();i++) {
			if(this.allShapes.get(i) instanceof Circle) {
			System.out.println("Circle has area "+this.allShapes.get(i).area());
			}else if(this.allShapes.get(i) instanceof Dot) {
				System.out.println("Dot has area "+this.allShapes.get(i).area());
			}else if(this.allShapes.get(i) instanceof Rectangle) {
				System.out.println("Rectangle has area "+this.allShapes.get(i).area());
			}else if(this.allShapes.get(i) instanceof Shape) {
					System.out.println("Shape has area "+this.allShapes.get(i).area());
			}else if(this.allShapes.get(i) instanceof Square) {
				System.out.println("Square has area "+this.allShapes.get(i).area());
			}
		}
	}
	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		m.addShape(new Circle(1.2, 3.4, 4.0)); // Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4)); // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0)); // Upcast from Square to Shape.
		m.listAllShapes();
		}
}
