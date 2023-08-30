package exam02;

public class ButtonTest {

	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListener(new CallListener()); // CallListener 객체 생성
		btn.touch(); // 전화를 겁니다.

		btn.setOnClickListener(new MessageListener()); // MessageListener 객체 생성
		btn.touch(); // 메시지를 보냅니다.
	}

}
