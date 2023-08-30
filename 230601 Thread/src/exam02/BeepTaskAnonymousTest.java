package exam02;

import java.awt.Toolkit;

public class BeepTaskAnonymousTest {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { // 익명클래스

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
