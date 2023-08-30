package java_exam_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//07. 프로그램에 주어진 2개의 String 타입 배열을 이용해 프로그램의 주석대로 수행하는 프로그램을 작성하시오. method 합집합 교집합
//
//public static void main(String[] args) {
//     String[] s1 = {"a","b","a","b","c"};
//     String[] s2 = {"c"};
//     
//// 두 배열을 Collections의 addAll() 메서드를 이용해 HashSet 객체로 생성
//// 2개의 HashSet 객체를 출력
//// 2개의 HashSet 객체가 동일한지 비교한 값을 출력
//// s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는지 출력
//// 2개의 HashSet 합집합과 교집합을 구해서 출력
//}

public class Exam07 {
	public static void main(String[] args) {
		String[] s1 = { "a", "b", "a", "b", "c" };
		String[] s2 = { "c" };

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		System.out.println("String[] s1 =" + Arrays.toString(s1));
		System.out.println("String[] s2 =" + Arrays.toString(s2));

		System.out.println("두 배열을 Collections의 addAll() 메서드를 이용해 HashSet 객체로 생성");
		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);
		System.out.println();

		System.out.println("2개의 HashSet 객체를 출력");
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
		System.out.println();

		System.out.println("2개의 HashSet 객체가 동일한지 비교한 값을 출력 : " + set1.equals(set2) + "\r\n");

//		System.out.println("s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는가? :" + set1.contains(set2)); // false ???
		System.out.println("s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는가? :" + set1.containsAll(set2) + "\r\n");
		
//		boolean result = false;
//		for (String element : set2) {
////			System.out.println(element);
////			System.out.println(set1.contains(element));
//			result = set1.contains(element);
//			if (result == false) {
//				break;
//			}
//		}
//		System.out.println("s1에 의한 HashSet이 s2에 의한 HashSet 원소를 모두 포함하는가? :" + result + "\r\n");

		System.out.println("2개의 HashSet 합집합과 교집합을 구해서 출력");
		Set<String> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		System.out.println("합집합 : " + unionSet);

		Set<String> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);
		System.out.println("교집합 : " + intersectionSet);

	}

}