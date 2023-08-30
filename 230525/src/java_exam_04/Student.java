package java_exam_04;

public class Student extends Person {

	private int std;

	Student(String name, int age, int std) {
		super(name, age);
		this.std = std;
	}

	// 메소드
	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public void show() {
		System.out.println("사람[" + "이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + std + "]");
	}

}
