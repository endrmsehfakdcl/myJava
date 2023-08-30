package mamuri;

public class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("음악을 재생합니다.");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}

	}
}
