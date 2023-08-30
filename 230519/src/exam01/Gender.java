package exam01;

public enum Gender {
	MALE("남성"), FEMALE("여성");

	private String s;

	Gender(String s) { //생성자
		this.s = s;
	}

	public String toString() { //String타입 리턴하는 toString()
		return s;
	}

}
