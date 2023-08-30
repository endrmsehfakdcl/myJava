package exam01;

public class WorkObject {

	public void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodA");
	}

}
