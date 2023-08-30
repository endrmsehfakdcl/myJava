package exam02;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) { 
		this.listener = listener; // OnClickListener 타입으로 listener 필드 선언
	}

	void touch() { // touch 메소드 실행시
		listener.onClick(); 
	}

	static interface OnClickListener { // 중첩 인터페이스
		void onClick();
	}
}
