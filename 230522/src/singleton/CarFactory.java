package singleton;

public class CarFactory {
	// 필드
	private static CarFactory carFactory = new CarFactory();
	String createCar;

	// 생성자
	private CarFactory() {
	}

	// 메소드
	static CarFactory getInstance() {
		return carFactory;
	}

	public Car createCar() {
		return new Car();
	}

}
