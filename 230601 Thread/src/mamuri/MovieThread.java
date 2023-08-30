package mamuri;

public class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}
