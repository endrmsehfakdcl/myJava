package java_exam_04;
// 03. 다음 표를 참고해 MovablePoint, MovablePoint의 부모 클래스인 Point를 작성하시오.
//     Point 클래스의 toString() 메서드는 좌표를 나타내는 문자열이며, MovablePoint 클래스의 toString() 메서드는 좌표와 이동 속도를 나타내는 문자열을 반환한다.
public class Point {
	// 필드
	private int x, y;

	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(x, y) = (" + getX() + ", " + getY() + ")";
	}

}
