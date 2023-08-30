package exam01;

public class Car {
	String company = "asddfas";
	String model = "sdf";
	String color = "adf";
	int maxSpeed = 4500;
	int speed; // 값을 정해놓지 않으면 자동 초기화

	// 생성자, 구조체, constructor, JVM이 만들어놓음, new Car()는 이걸 호출한다.
	Car() {}

	// 매개변수 생성자가 필요할 때는 디폴트 생성자 Car(){} 생성할 것
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}
