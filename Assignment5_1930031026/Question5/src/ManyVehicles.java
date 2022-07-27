import java.util.ArrayList;
public class ManyVehicles{
	private ArrayList<Vehicle> vehicles;//set arributes
	public ManyVehicles(){//construtor
		this.vehicles = new ArrayList<Vehicle>();
	}
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);//add element to arraylist
	}
	public  int calcAvgSpeed() {
		int sumSpeed=0;//default value of all vehicle's speed
		for(Vehicle v:this.vehicles) {//enhanced for loop 
			sumSpeed += v.getSpeed();
		}
		return sumSpeed/this.vehicles.size();//return the value of total speed divided by elements number 
	}
	public static void testManyVehicles() {
		ManyVehicles mv = new ManyVehicles();
// Add any kind of vehicles to the arraylist.
		try {
			Train t = new Train(350, 300);
			mv.addVehicle(t);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Car c = new Car(100, 80);
			mv.addVehicle(c);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		try {
			Aircraft a = new Aircraft(700, 200, 100);
			mv.addVehicle(a);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (BadAltitudeSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		}
		System.out.println(mv.calcAvgSpeed() == 193);
	}

}
