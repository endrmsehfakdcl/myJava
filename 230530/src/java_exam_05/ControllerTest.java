package java_exam_05;

public class ControllerTest {

	public static void main(String[] args) {
		TV tv = new TV(false);
		Radio radio = new Radio(true);

		tv.show();
		radio.show();
	}

}
