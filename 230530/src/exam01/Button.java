package exam01;

public class Button {
	// field
	OnClickListener listener;

	// construct
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// method
	void touch() {
		listener.onClick();
	}

	static interface OnClickListener {
		void onClick();
	}
}
// 구현체 없어서 실행못함