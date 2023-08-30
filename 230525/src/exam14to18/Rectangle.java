package exam14to18;

public class Rectangle extends Shape {
	int base;
	int height;

	public Rectangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}

	public double findArea() {
		return base * height;
	}

}
