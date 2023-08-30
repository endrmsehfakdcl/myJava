package mamuri;

public class MovieThread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			if (this.isInterrupted())
			{
				System.out.println("MovieThread2 - Interrupted");
				break;
			}

		}
	}
}
