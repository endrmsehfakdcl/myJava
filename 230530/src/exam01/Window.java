package exam01;

public class Window {
	Button bt1 = new Button();
	Button bt2 = new Button();

	Button.OnClickListener listener = new Button.OnClickListener() {
		// 익명클래스
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};

	// 생성자 Window() > button setter call
	Window() { // class bt1 bt2 만들지 않고 바로 구현체 만들어서 실행
		bt1.setOnClickListener(listener); // 익명클래스 호출
		bt2.setOnClickListener(new Button.OnClickListener() { // new
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
