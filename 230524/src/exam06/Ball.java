package exam06;

public class Ball extends Circle {
	// 필드
	private String color;

	// 생성자
	public Ball(String color) {
		super(); // 자식 생성자에 부모생성자 자동 호출
		this.color = color;
	}

	// 메소드
	public void findColor() {
		System.out.println(color + "공입니다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(파이*반지름*반지름*반지름)이다.");
	}
	// 재정의 override
	public void findArea() {
		System.out.println("넓이는 4*(파이 * 반지름 * 반지름)이다.");
	}
}
