package exam14to18;

public class Circle {
	// 필드
	private double radius;
	// 생성자

	// 메소드
	double findArea() {
		return Math.PI * radius * radius;
	}

	void show(double x, double y) {
		System.out.println("반지름 = " + x + ", " + " 넓이 = " + y);
	}

	public double getRadius() {
		return radius;
	}
	
	// radius 값이 0보다 클 때 radius 초기화
	public void setRadius(double radius) { 
		if (radius > 0.0) {
			this.radius = radius;
		} else {
			System.out.println("radius는 0보다 커야합니다.");
			return;
		}
	}

}
