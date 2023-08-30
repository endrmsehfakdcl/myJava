package java_exam_04;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	void show() {
		System.out.println("color = " + color);
		System.out.println("speed = " + speed);
	}
}
