
public class ControllerMoreBook extends Controller{
	public ControllerMoreBook(Library m) {
		super(m);
	}
	public String moreBook(String name, String number) {
		
		try {
			m.moreBook(name, Integer.parseInt(number));
			return "";
		} catch (NumberFormatException ex) {
			return ex.getMessage();
		} catch (UnknownUserException ex) {
			return ex.getMessage();
		} catch (NotALenderException ex) {
			return ex.getMessage();
		}
		
	}
}
