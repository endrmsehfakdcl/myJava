package java_exam_03;

public class Triangle {
	// 필드
	private double base;
	private double height;

	// 생성자
//	public Triangle(double base, double height) {
//		this.base = base;
//		this.height = height;
//	}

	// 메소드
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		} else {
			this.base = 1.0;
			System.out.println("삼각형 밑변의 최솟값은 0보다 커야 합니다. 밑변의 값을 1로 초기화합니다.");
		}
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 1.0;
			System.out.println("삼각형 높이의 최솟값은 0보다 커야 합니다. 높이의 값을 1로 초기화합니다.");
		}
	}

	public double findArea(double base, double height) {
		return base * height / 2;
	}
	
	public boolean isSameArea(double Area, double Area2) {
		if (Area == Area2) {
			return true;
		}
		else return false;
	}
}
