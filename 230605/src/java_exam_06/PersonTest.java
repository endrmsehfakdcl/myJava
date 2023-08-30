package java_exam_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Person 클래스는 이름과 나이를 포함하며, 이름과 나이를 반환하도록 toString() 메서드를 오버라이딩한다.
// 객체를 중복 없이 저장하는 HashSet 컬렉션에 Person 객체를 추가한다. HashSet은 원소의 중복 여부를 hashCode()와 equals() 메서드를 이용해 판단한다. 반복자를 사용해 HashSet 컬렉션 원소를 출력한다.

public class PersonTest {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();

		set.add(new Person("김자바", 20));
		set.add(new Person("김자바", 20));
		set.add(new Person("김자바", 22));
		set.add(new Person("이자바", 22));
		set.add(new Person("이자바", 27));
		set.add(new Person("박자바", 24));
		set.add(new Person("박자바", 24));

		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person);
//			System.out.println(person.hashCode());
		}
	}
}
