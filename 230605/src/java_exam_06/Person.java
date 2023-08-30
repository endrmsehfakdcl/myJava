package java_exam_06;

//Person 클래스는 이름과 나이를 포함하며, 이름과 나이를 반환하도록 toString() 메서드를 오버라이딩한다.
public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 이름과 나이가 동일하다면 같은 사람으로 가정함
	// Collection(HashMap, HashSet, HashTable)
	// hashCode() return -> equals() return -> 동일객체
	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * name.hashCode() + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return name.equals(person.name) & age == person.age;
		}
		return false;
	}

}
