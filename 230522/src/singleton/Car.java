package singleton;

public class Car {
	// 필드
	int carNum;
	private static int serialNum = 10000;

	// 생성자
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	// 메소드
	public int getCarNum() {
		return carNum;
	}

}
