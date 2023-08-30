package exam14to18;

public class Car2 {
	static int speed;

	static void run() {
		System.out.println(speed + "로 달립니다.");
	}

	public static void main(String[] args) {
//		Car2 myCar = new Car2();
//		myCar.speed = 60;
//		myCar.run();

		speed = 60;
		run();
	}
}
