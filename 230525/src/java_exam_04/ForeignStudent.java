package java_exam_04;

public class ForeignStudent extends Student {

	private String nation;

	ForeignStudent(String name, int age, int std, String nation) {
		super(name, age, std);
		this.nation = nation;
	}

	// 메소드
	public String getNation() {
		return nation;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}

	public void show() {
		System.out.println("사람[" +"이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getStd() + ", 국적 : " + nation + "]");
	}
}
