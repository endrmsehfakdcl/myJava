package exam14to18;

public class CircleTest {

	public static void main(String[] args) {
//		Shape s = new Shape();

		Circle c = new Circle(10);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());

		Rectangle r = new Rectangle(10, 20);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f", r.findArea());
	}

}
