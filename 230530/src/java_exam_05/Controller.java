package java_exam_05;

public abstract class Controller {
	// field
	boolean power;

	// construct
	public Controller(boolean power) {
		this.power = power;
	}

	// method
	public void show() {
		if (power) {
			System.out.println(getName() + "가 켜졌습니다.");
		} else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}

	public abstract String getName();
}
