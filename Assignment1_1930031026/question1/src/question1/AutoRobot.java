package question1;

public class AutoRobot {
	private double currentSpeed;
	private String name;
	public AutoRobot() {
		this.name="xyz";//set default name
		this.currentSpeed=0;//set initial speed
	}
	public String getName() {
		return this.name;
	}
	public double getCurrentSpeed() {
		return this.currentSpeed;
	}
	public void accelerate() {
		if (this.currentSpeed>20.0) {
			this.currentSpeed=20.0;
			System.out.println("Dangerous! Please stay within speed limit.");//if the speed is larger than 20, do warning
		}else {
		this.currentSpeed=this.currentSpeed+5.0;//else accelerate it by 5.0
		}
	}
	public void brake() {
		if(this.currentSpeed-5.0<=0) {
			this.currentSpeed=0;//restrict the speed less than 0
		}else {
			this.currentSpeed=this.currentSpeed-5.0;
		}
	}
	public void showStatus() {
		System.out.println("Hello there, my name is "+this.name+"and my current speed is "+this.currentSpeed);
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void testAutoRobot() {
		AutoRobot robot=new AutoRobot();//initialize a robot
		System.out.println(robot.getName()=="xyz");//test the initial name
		System.out.println(robot.getCurrentSpeed()==0);//test the initial speed
		robot.accelerate();
		System.out.println(robot.getCurrentSpeed()==5);//test the accelerate method
		robot.brake();
		System.out.println(robot.getCurrentSpeed()==0);//test the brake method
		robot.showStatus();//test showStatus method
		robot.setName("Terminal");//change the name
		System.out.println(robot.getName()=="Terminal");//check if the name be changed
		
	}
}
