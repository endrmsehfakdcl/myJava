package java_exam_03;

public class Complex {
	//필드
	double real;
	double imagine;
	//생성자
	
	//메소드
	public void print(double real) {
		System.out.println(real + " + 0.0i");
	}
	public void print(double real, double imagine) {
		System.out.println(real + " + " + imagine + "i");
	}
}
