package exam02;

public class CarThread extends Thread {
	private String who;
	private String where;
	private SharedCar car;

	public CarThread(String who, String where, SharedCar car) {
		this.who = who;
		this.where = where;
		this.car = car;
	}

	@Override
	public void run() {
		car.drive(who, where);
	}
}
