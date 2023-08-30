package exam07;

import java.util.HashMap;
import java.util.Map;

public class StudnetTest {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student("홍길동", 1), 95);
		map.put(new Student("김자바", 2), 70);
		map.put(new Student("홍길동", 1), 100); 

		System.out.println(map.size());
	}
}
