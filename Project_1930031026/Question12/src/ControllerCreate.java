
public class ControllerCreate extends Controller{
	public ControllerCreate(Library m) {
		super(m);
	}
	
	public String create(String name, String number, int type) {
		try{
			if(type==0) {//if it's a lender
			m.addUser(new Lender(name, Integer.parseInt(number)));//add a new lender
			return "";//return empty string
			}
		}catch (NumberFormatException e) {
				return e.getMessage();
			} 
		try{if(type==1) {
				m.addUser(new Borrower(name, Integer.parseInt(number)));
				return "";//return empty string
				}	
			}catch (NumberFormatException e) {
			return e.getMessage();
			} catch (NotALenderException e) {
			return e.getMessage();
		}
		return "Input the correct type!";
		}
}
