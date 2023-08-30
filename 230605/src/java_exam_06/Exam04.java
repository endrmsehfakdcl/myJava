package java_exam_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
04. HashSet과 TreeSet을 비교하려고 다음 내용을 차례대로 수행하는 프로그램을 작성하시오.
아래 프로그램과 같이 String 타입의 객체로 구성된 HashSet을 생성하고, 동물 이름을 6개 추가시킨 후 HashSet의 원소를 출력한다.
HashSet 객체를 TreeSet 타입으로 변환하고 TreeSet의 원소를 출력한다.
TreeSet 클래스가 제공하는 first(), last(), lower() 등 메서드를 테스트하는 실행문을 추가한다.

public static void main(String[] args) {
        Set<String> a1 = new HashSet<>();
        a1.addAll(Arrays.asList("독수리","나비","염소","고양이","개미","여우"));
        System.out.println("hashset" + a1);
        //코드추가
   }
*/
public class Exam04 {

	public static void main(String[] args) {
		Set<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
		System.out.println("hashset" + a1);

		TreeSet<String> treeSet = new TreeSet<>(a1);
		System.out.println("treeset" + treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println("treeSet.lower(\"개미\") " + treeSet.lower("개미"));
		System.out.println("treeSet.lower(\"고양이\") " + treeSet.lower("고양이"));
		System.out.println("treeSet.lower(\"나비\") " + treeSet.lower("나비"));
		System.out.println("treeSet.lower(\"독수리\") " + treeSet.lower("독수리"));
		System.out.println("treeSet.lower(\"여우\") " + treeSet.lower("여우"));
		System.out.println("treeSet.lower(\"염소\") " + treeSet.lower("염소"));
	}

}
