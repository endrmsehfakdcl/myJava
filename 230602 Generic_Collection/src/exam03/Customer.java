package exam03;

public class Customer implements Runnable {

	private Dish dish;

	public Customer(Dish dish) {
		this.dish = dish;
	}

	private void eat(int i) throws InterruptedException {
		// 공유 객체 dish를 보호하기 위해서 동기화 블록
		synchronized (dish) {
			while (dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println(i + "번째 음식을 먹었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			try {
				eat(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
