package exam03;

public class Cook implements Runnable {
	private Dish dish;

	public Cook(Dish dish) {
		this.dish = dish;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				cook(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	private void cook(int i) {
		// 동기화 블록 : 요리사가 음식을 준비하는 동안 공유자원 dish를 보호함
		synchronized (dish) {
			while (!dish.isEmpty()) {
				try {
					dish.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다.");
			dish.notify();
		}

	}

}
