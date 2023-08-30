package java_exam_04;

public class Car extends Vehicle {
	int displacement;
	int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("color = " + color);
		System.out.println("speed = " + speed);
		System.out.println("displacement = " + displacement);
		System.out.println("gears = " + gears);
	}
}
