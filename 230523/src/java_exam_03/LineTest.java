package java_exam_03;

public class LineTest {
	public static void main(String[] args) {
		Line line1 = new Line(10);
		Line line2 = new Line(11);

		if (line1.isSameLine(line1.line, line2.line)) {
			System.out.println("line1과 line2의 길이가 같습니다.");
		} else {
			System.out.println("line1과 line2의 길이가 다릅니다.");
		}

	}
}