package mamuri;

public class ThreadExample2 {
	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main - Interrupted");
		thread.interrupt();
	}
}
