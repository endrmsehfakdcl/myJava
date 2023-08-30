package exam14to18;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
//		circle.radius = 10.0;
		circle.setRadius(10.0);
		circle.show(circle.getRadius(), circle.findArea());

		System.out.println();

		Circle circle2 = new Circle();
//		circle2.radius = -10.0;
		circle2.setRadius(-10.0);
		circle2.show(circle2.getRadius(), circle2.findArea());

	}

}
