package java_exam_04;

public class Phone {
	protected String owner;

	Phone() {
	}

	Phone(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}
