package exam02;

public class PriorityTest {

	public static void main(String[] args) {
		Counter counter1 = new Counter("느긋한");
		counter1.setPriority(Thread.MIN_PRIORITY);

		Counter counter2 = new Counter("급한");
		counter2.setPriority(Thread.MAX_PRIORITY);
		
		counter1.start();
		counter2.start();

	}

}
