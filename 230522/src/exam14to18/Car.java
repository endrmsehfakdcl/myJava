package exam14to18;

public class Car {
	int speed;

	int getSpeed() {
		return speed;
	}

	void keyTurnOn() {
		System.out.println("시동을 겁니다.");
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) {
			speed += i;
			System.out.println("달립니다. (시속: " + speed + "km/h)");
		}
	}
}
