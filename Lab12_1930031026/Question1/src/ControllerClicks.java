import java.awt.Point;

public class ControllerClicks extends Controller{
	public ControllerClicks(Model m) {
		super(m);
	}//constructor
	public void mouseClicked(Point p) {
		m.addPoint(p);
	}
	public void resetClicked() {
		m.clearAllPoints();
	}
	public void undoClicked() {
		m.deleteLastPoint();
	}
}
