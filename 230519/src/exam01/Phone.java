package exam01;

public class Phone {
	// 필드 model value year
	String model;
	int value;
	int year;

	// public Phone() {} > 디폴트 생성자
	
	// 메소드 print()
	void print() {
		// String model_2 > 메소드 안에 선언하면 필드가 아닌 지역변수가 된다.
		System.out.println(value + "만 원짜리 " + model + " 스마트폰");
	}

}
