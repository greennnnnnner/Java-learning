
public class Train extends Vehicle{
	public Train(int speedLimit, int speed) throws BadSpeedSetting {
		super(speedLimit, speed);
	}
	public boolean canFly() {
		return false;
	}
	public int accelerate(int amount) throws TrainSpeedChange {//override accelerate function
		throw new TrainSpeedChange("Do not try to accelerate or decelerate the train!");
	}
	public static void testTrain() {
		// test case for constructors
		try {
			// exception
			Train t1 = new Train(350, 400);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be greater than speed limit!"));
		}
		try {
			// exception
			Train t2 = new Train(350, -100);
		} catch (BadSpeedSetting e) {
			System.out.println(e.getMessage().equals("Speed cannot be negative!"));
		}
		// test case for accelerate, canFly and getSpeed methods
		try {
			Train t3 = new Train(350, 300);
			// test the canFly method
			System.out.println(t3.canFly() == false);
			// test the getSpeed
			System.out.println(t3.getSpeed() == 300);
			// exception
			t3.accelerate(50);
		} catch (BadSpeedSetting e) {
			System.out.println("BUG! THIS MUST NEVER HAPPEN!");
		} catch (TrainSpeedChange e) {
			System.out.println(e.getMessage().equals("Do not try to accelerate or decelerate the train!"));
		}
	}
}
