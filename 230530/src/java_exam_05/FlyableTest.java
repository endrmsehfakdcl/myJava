package java_exam_05;

public class FlyableTest {

	public static void main(String[] args) {
		Flyable flyable = new Flyable() {
			@Override
			public void speed() {
				System.out.println("속도");
			}

			@Override
			public void height() {
				System.out.println("높이");
			}

		};
		flyable.speed();
		flyable.height();
	}

}
