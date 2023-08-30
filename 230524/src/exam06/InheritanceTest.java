package exam06;

public class InheritanceTest {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Ball b1 = new Ball("red");

		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();

		System.out.println("공 : ");
		b1.findRadius();
		b1.findArea();
		b1.findVolume();
		b1.findColor();

	}

}
