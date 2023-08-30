package exam01;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
//		Bus bus = (Bus) vehicle;
//		bus.checkFare();
//		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		

	}
}
