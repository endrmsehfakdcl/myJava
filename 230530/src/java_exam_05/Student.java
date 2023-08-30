package java_exam_05;

public class Student implements Human {

	@Override
	public void print() {
		System.out.println("20세의 학생입니다.");
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

}
