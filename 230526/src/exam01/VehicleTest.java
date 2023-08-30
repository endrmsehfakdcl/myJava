package exam01;

public class VehicleTest {

	public static void main(String[] args) {

//		Vehicle vehicle = new Vehicle(); // 인터페이스는 인스턴스 생성 x
		Vehicle vehicle = new Bus();

		vehicle.run();
//		vehicle.checkFare();
		System.out.println();
		
		//강제 형변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();

	}

}
