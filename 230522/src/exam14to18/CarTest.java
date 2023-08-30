package exam14to18;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "((km/h)"); // +10 +20 +30 +40  +50
															//  10  30  60  100 +150
	}

}
