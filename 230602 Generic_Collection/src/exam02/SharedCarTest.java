package exam02;

public class SharedCarTest {

	public static void main(String[] args) {
		SharedCar car = new SharedCar();

		new CarThread("김자바", "서울", car).start();
		new CarThread("이자바", "부산", car).start();
		new CarThread("박자바", "울산", car).start();

	}

}
