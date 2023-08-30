package exam14to18;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {

		System.out.println("부모객체의 메소드 areaCircle");
		return Math.PI * r * r;

	}
}
