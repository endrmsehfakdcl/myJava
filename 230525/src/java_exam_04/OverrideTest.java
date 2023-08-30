package java_exam_04;

public class OverrideTest {
	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
//		Vehicle v = new Vehicle("빨깡", 100);
		Vehicle v = c;
		v.show();
	}
}
