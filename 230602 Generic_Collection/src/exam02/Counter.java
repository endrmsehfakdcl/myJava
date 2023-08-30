package exam02;

public class Counter extends Thread {

	private int count;

	public Counter(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while (count++ < 5) {
			System.out.print(getName() + " -> ");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
