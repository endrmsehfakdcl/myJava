package exam02;

public class JoinThread extends Thread {
	int total;

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			total += i;
			System.out.println("total => " + total);

		}
	}
}
