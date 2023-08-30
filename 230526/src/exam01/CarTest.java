package exam01;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		myCar.frontLeftTire = new KumhoTire(); // 같은 인터페이스 Tire를 구현해서 필드를 교체가능
		myCar.frontRightTire = new KumhoTire(); // 인터페이스의 다형성
		System.out.println();
		myCar.run();
	}

}
