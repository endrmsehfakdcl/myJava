package exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		WorkObject work = new WorkObject();
		ThreadA2 threadA2 = new ThreadA2(work);
//		Exception in thread "main" java.lang.IllegalArgumentException
//		at java.base/java.util.concurrent.ThreadPoolExecutor.<init>(ThreadPoolExecutor.java:1303)
//		at java.base/java.util.concurrent.ThreadPoolExecutor.<init>(ThreadPoolExecutor.java:1189)
//		at java.base/java.util.concurrent.Executors.newFixedThreadPool(Executors.java:92)
//		at exam01.ThreadPoolTest.main(ThreadPoolTest.java:11)
		// It means that THREAD_POOL_SIZE is 0 or negative.
//		ExecutorService exec = Executors.newFixedThreadPool(0);
		ExecutorService exec = Executors.newFixedThreadPool(100);
		exec.execute(threadA2);

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "안녕");
		}
		try {
			ThreadA2.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		exec.shutdown();
	}

}
