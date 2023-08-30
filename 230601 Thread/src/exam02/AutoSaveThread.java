package exam02;

// 1초에 한번 저장하는 데몬 스레드
public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업내용을 저장..");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("interrupt 호출됨.");
//				e.printStackTrace();
				break;
			}
			save();
		}

	}
}
