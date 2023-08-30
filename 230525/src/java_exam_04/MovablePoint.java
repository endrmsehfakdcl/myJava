package java_exam_04;
//03. 다음 표를 참고해 MovablePoint, MovablePoint의 부모 클래스인 Point를 작성하시오.
//Point 클래스의 toString() 메서드는 좌표를 나타내는 문자열이며, MovablePoint 클래스의 toString() 메서드는 좌표와 이동 속도를 나타내는 문자열을 반환한다.
public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "(x, y) = (" + getX() + ", " + getY() + ")" + "\n" + "xSpeed : " + getXSpeed() + ", ySpeed : " + getYSpeed();
	}

}
