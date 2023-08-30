package exam9to13;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 디폴트 생성자
	public Car() {
		this("그랜저", "흰색", 450);
	}

	// 매개변수 생성자
	public Car(String model) { // this 클래스 안에서 클래스 자신을 지칭
		// this. : 필드
//		this.model = model; 
		// this() : 생성자
		this(model, "흰색", 450); // 생성자에서 초기화함
	}

	// 매개변수 생성자 오버로딩
	public Car(String model, String color) {
//		this.model = model;
//		this(model);
//		this.color = color;
		this(model, color, 450);
	}

	// 매개변수 생성자 오버로딩
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		// 같은 코드가 위에서 중복되는 경우
//		this(model, color);
		this.maxSpeed = maxSpeed;
	}

//	public Car(String color, String model) {
//		Duplicate method Car(String, String) in type Car
//	}

}