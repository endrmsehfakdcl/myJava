package exam01;

import java.util.Arrays;

public class Person implements Comparable<Person> {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {

		return "[" + name + " : " + age + "]";

	}

	@Override
	public int compareTo(Person o) {
//		if (this.age > o.age) { // 오름차순 정렬
//			return 1;
//		} else if (this.age < o.age) {
//			return -1;
//		} else
//			return 0;

//	}
		if (this.name.length() > o.name.length()) {
			return 1;
		} else if (this.name.length() < o.name.length()) {
			return -1;
		} else return 0;
//		return this.age - o.age; // 오름차순
//		return o.age - this.age; // 내림차순
	}

}
