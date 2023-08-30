package exam01;

public class CarTest {

	public static void main(String[] args) {
		
		Car mycar = new Car(); // 디폴트 생성자를 호출하기 위해 생성한다.

		System.out.println("제작회사 : " + mycar.company);
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색깔 : " + mycar.color);
		System.out.println("최고 속도 : " + mycar.maxSpeed);
		System.out.println("현재 속도 : " + mycar.speed);

		mycar.speed = 100;
		System.out.println("현재 속도 : " + mycar.speed);

		Car yourcar = new Car("그린", 150);
		System.out.println(yourcar.company);
		System.out.println(yourcar.model);
		System.out.println(yourcar.color); // 생성자로 초기화한 그린
		System.out.println(yourcar.maxSpeed);
		System.out.println(yourcar.speed); // 생성자로 초기화한 150

	}

}
