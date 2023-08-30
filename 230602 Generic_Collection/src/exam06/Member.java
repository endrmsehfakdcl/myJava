package exam06;

public class Member {
	private String name;
	private int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age; 
	}

	// 중복을 허용하지 않는 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) & (member.age == age);
		}
		return false;

	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
