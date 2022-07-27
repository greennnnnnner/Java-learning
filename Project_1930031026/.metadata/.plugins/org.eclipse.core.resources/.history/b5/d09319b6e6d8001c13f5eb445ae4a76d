
public class ControllerGetBook extends Controller{
	public ControllerGetBook(Library m) {
		super(m);
	}
	public String getBook(String name) {
		try {
			return Integer.toString(super.m.getBook(name));
		}catch(UnknownUserException ex) {//catch the exception
			return ex.getMessage();//return the message of exception
		}
	}
}
