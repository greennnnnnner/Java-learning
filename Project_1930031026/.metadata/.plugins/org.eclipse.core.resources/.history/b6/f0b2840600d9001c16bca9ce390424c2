import javax.swing.JFrame;

public abstract class View<T extends Controller> extends JFrame implements ModelListener{
	protected Library m;
	protected T c;
	public View(Library m, T c) {
		//constructor
		this.m = m;
		this.c = c;
	}
	public abstract void update();
}
