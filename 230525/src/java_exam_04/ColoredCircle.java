package java_exam_04;

public class ColoredCircle extends Circle {
	// 필드
	String color;

	// 생성자
	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

	// 메소드
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}
}
