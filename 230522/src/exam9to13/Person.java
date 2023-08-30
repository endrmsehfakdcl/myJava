package exam9to13;

public class Person {
	String name;
	String ssn;
	int ppn;

	public Person() {
	}

	public Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public Person(String name, String ssn, int ppn) {
		this.name = name;
		this.ssn = ssn;
		this.ppn = ppn;
	}

	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("주민등록번호 : " + ssn);
		if (ppn == 0) {
			System.out.println("여권을 가지고 있지 않습니다.");
		} else {
			System.out.println("여권번호 : " + ppn);
		}
	}
}
