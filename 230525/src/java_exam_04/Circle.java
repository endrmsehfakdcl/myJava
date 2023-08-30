package java_exam_04;

public class Circle {
	// 필드
	int radius;

	// 생성자
	Circle(int radius) {
		this.radius = radius;

	}

	// 메소드
	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}
