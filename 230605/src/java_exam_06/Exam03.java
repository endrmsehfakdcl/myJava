package java_exam_06;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//03. Hashtable을 이용해 4개의 이름과 점수를 저장하시오. 그리고 키보드로 이름을 입력하면 대응하는 점수를 알려 주는 프로그램을 작성하시오.
public class Exam03 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();

		map.put("김자바", 90);
		map.put("이자바", 50);
		map.put("박자바", 70);
		map.put("최자바", 60);

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.nextLine();
				if (map.containsKey(name)) {
					System.out.println(name + "의 점수는 " + map.get(name));
				}
			}
		}
	}
}
