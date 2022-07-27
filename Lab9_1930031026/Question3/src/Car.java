
public class Car {
	private String name;
	private Door[] doors;
	public Car(String name, int numberOfDoors) throws BadCarException{
		this.name=name;
		if(numberOfDoors<1) {
			throw new BadCarException("A car must have at least one door!");
		}//throw exception if door is less than 1
		this.doors = new Door[numberOfDoors];
		for(int i=0; i<numberOfDoors; i++) {
			this.doors[i]= new Door();
		}
		
	}
	public void listDoors() {
		for(Door d:this.doors) {//enhenced for loop
			if(d.isOpen()) {
				System.out.println(this.name+ ": door is open" );
			}else {
				System.out.println(this.name+ ": door is closed");
			}
		}
	}
	public int countOpenDoors() {
		int c=0;
		for(Door d: this.doors) {
			if(d.isOpen()) {
				c++;
			}
		}return c;
	}
	public void openOneDoor(int doorNumber) throws BadDoorException{
		if(doorNumber<1 || doorNumber > this.doors.length) {
			throw new BadDoorException("Door "+ doorNumber + " does not exist!");
		}
		this.doors[doorNumber-1].open();
	}
	public void changeAllDoors() {
		for(Door d: this.doors) {
			if(d.isOpen()) {
				d.close();
			}else {
				d.open();
			}
		}
	}
	public void replaceDoor(int doorNumber) throws BadDoorException {
		if(doorNumber<1 || doorNumber > this.doors.length) {
			throw new BadDoorException("Door "+ doorNumber + " does not exist!");
		}
		this.doors[doorNumber-1] = new Door();
	}
	public static void testCar() {
		try {
			Car brokencar = new Car("Broken", 0);
		} catch(BadCarException ex) {
			System.out.println(ex.getMessage() == "A car must have at least one door!");
		}
		Car c = null;
		try {
			c = new Car("Biggy", 7);
		} catch(BadCarException ex) {
			System.out.println("BUG! This must never happen!");
		}
		c.listDoors();
		System.out.println(c.countOpenDoors() == 0);
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 7);
		c.listDoors();
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 0);
		try {
			c.openOneDoor(8);
		} catch(BadDoorException ex) {
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}
		try {
			c.openOneDoor(3);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 1);
		
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 6);
		c.listDoors();
		c.changeAllDoors();
		System.out.println(c.countOpenDoors() == 1);
		c.listDoors();
		try {
			c.replaceDoor(8);
		} catch(BadDoorException ex) {
	
			System.out.println(ex.getMessage().equals("Door 8 does not exist!"));
		}

		try {
			c.replaceDoor(3);
		} catch(BadDoorException ex) {
			System.out.println("BUG! This must never happen!");
		}
		System.out.println(c.countOpenDoors() == 0);
		
		c.listDoors();
	}
}
