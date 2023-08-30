package exam9to13.hankook;

public class Tire {
	// 필드
	private int count;

	// 생성자

	// 메소드
	public int getCount() {
		return count;
	}
	
	// setCount가 없다면 읽기전용
//-------------------------------------------
	public void setCount(int count) {
		if (count <= 4) {
			this.count = count;
		} else {
			System.out.println("바퀴는 4개 이하로 제작이 됩니다.");
		}
	}
}
