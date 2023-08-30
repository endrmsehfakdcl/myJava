package exam14to18;

public abstract class Shape {
	double pi = 3.14;
	
	abstract void draw(); // 클래스 상속 받으면 abstract 반드시 구현해야함
	
	public double findArea() {
		return 0.0;
	}
}
