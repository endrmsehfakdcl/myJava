package exam02;

public class JoinTest {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();

		
		try {
			t.join();
			System.out.println("스레드가 끝날때까지 대기함.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("총 합 : " + t.total);
	}
}
