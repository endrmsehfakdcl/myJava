package exam03;
// JoinTest와 비교, 동일한 결과
public class WaitNotifyTest {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();
		synchronized (t) {
			System.out.println("스레드 t가 끝날때까지 대기...");
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("총합 : " + t.total);
	}

}
