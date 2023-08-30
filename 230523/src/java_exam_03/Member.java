package java_exam_03;

public class Member {
	// 필드 이름 아이디 암호 나이
	private static String name;
	private static String id;
	private static String password;
	private static int age;

	// 생성자
	private Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public String id() {
		return id;
	}

	public String password() {
		return password;
	}

	public int age() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("나이는 0보다 큰 수를 입력해야 합니다.");
		}
	}
}
