package exam02;

public class BeepPrintThreadTest {

	public static void main(String[] args) {
		Runnable bt = new BeepTask();
		Thread thread = new Thread(bt);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
