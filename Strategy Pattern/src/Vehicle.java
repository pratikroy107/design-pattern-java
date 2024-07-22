
public class Vehicle {
	DriveStrategy ds;
	
	//constructor injection
	public Vehicle(DriveStrategy ds) {
		this.ds = ds;
	}
	
	public void drive() {
		ds.drive();
	}
}
