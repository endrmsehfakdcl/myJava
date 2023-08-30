package ex01;

public class Car {
	public int speed;
	
	public final void start() {
		System.out.println("출발");
	}

	protected void speedUp() {
		speed += 1;
	}

	void stop() {
		System.out.println("차가 멈춤");
		speed = 0;
	}

}
