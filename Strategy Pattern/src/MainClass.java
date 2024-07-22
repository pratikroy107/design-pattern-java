
public class MainClass {
	public static void main(String[] args) {
		
		Vehicle v1 = new NormalVehicle();
		v1.drive();
		
		v1 = new SpecialVehicle();
		v1.drive();
	}
}
