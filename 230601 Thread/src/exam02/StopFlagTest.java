package exam02;

public class StopFlagTest {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		printThread.interrupt();
		
		printThread.setStop(true);
	}

}
