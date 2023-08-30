package java_exam_04;
//03. 다음 표를 참고해 MovablePoint, MovablePoint의 부모 클래스인 Point를 작성하시오.
//Point 클래스의 toString() 메서드는 좌표를 나타내는 문자열이며, MovablePoint 클래스의 toString() 메서드는 좌표와 이동 속도를 나타내는 문자열을 반환한다.
public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		MovablePoint p2 = new MovablePoint(1, 2, 3, 4);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
