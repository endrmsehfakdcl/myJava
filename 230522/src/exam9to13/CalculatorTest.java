package exam9to13;

import exam14to18.Car2;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		System.out.println("15 + 22 = " + cal.plus(15,22));
		System.out.println("10 / 21 = " + cal.divide(10, 21));
		
		int result = cal.plus(100, 200);
		System.out.println(result);
		
		double result2 = cal.divide(100, 200);
		System.out.println(result2);
		
		//컴파일 에러 > 타입 주의
//		double result3 = cal.divide(100.0, 200.0); 
		
		cal.powerOff();
		
	}

}
