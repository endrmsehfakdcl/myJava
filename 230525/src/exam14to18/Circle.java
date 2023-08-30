package exam14to18;

public class Circle extends Shape {
	// 필드
	int radius;

	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	// 메소드
	@Override
	void draw() { // 반드시 구현해야되는 abstract method
		System.out.println("원을 그립니다.");
	}

	public double findArea() {
		return pi * radius * radius;
	}

}
