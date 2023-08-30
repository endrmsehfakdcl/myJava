package java_exam_04;

public class Person {
	// 필드
	private String name;
	private int age;

	// 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setName(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("사람[" + "이름 : " + name + ", 나이 : " + age + "]");
	}

}
