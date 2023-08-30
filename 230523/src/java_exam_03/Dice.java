package java_exam_03;

public class Dice {
	// 필드
	int side;
	// 생성자

	// 메소드
	public int roll() {
//		return (int) (Math.random() * 6) + 1;
		side = ((int) (Math.random() * 6) + 1);
		return side;
	}
}
