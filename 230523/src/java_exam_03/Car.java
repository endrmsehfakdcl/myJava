package java_exam_03;

public class Car {
	// 필드
	private static int carNum;
	private static int redCarNum;
	// 생성자
	public Car(String color) {
		carNum++;
		if (color == "red") redCarNum++;
	}

	// 메소드
	public void print() {
		System.out.println("생산된 자동차 수 : " + carNum);
		System.out.println("빨간색 자동차 수 : " + redCarNum);
	}

}
