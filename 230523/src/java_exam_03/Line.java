package java_exam_03;

public class Line {
	//필드
	int line;
	//생성자
	Line(int line){
		this.line = line;
	}
	
	//메소드
	public boolean isSameLine(int line1, int line2) {
		if (line1 == line2) return true;
		else return false;
	}
}
