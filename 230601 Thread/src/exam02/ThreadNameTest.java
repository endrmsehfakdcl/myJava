package exam02;

public class ThreadNameTest {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread(); // currentThread == name;
		System.out.println("쓰레드의 시작이믈 : " + thread.getName());

		ThreadA ta = new ThreadA();
		System.out.println("작업 스레드의 이름 : " + ta.getName());
		ta.start();
		
		ThreadB tb = new ThreadB();
		System.out.println("작업 스레드의 이름 : " + tb.getName());
		tb.start();
	}

}
