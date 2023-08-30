package practice.ex07;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//05. 다음과 같은 스트림이 있다. collect()를 사용하여 다음 세가지 연산(원소에 대한 평균, 원소의 제곱값에 대한 평균, 그리고 원소를 하이픈('-')으로 연결한 문자열로 수집) 결과를 출력하는 프로그램을 작성하시오.
//Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
public class Exam05 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		double avg = stream.collect(Collectors.averagingDouble(s -> s));
		stream = Stream.of(1, 2, 3, 4, 5);
		double sqrt = stream.collect(Collectors.averagingDouble(s -> s * s));
		stream = Stream.of(1, 2, 3, 4, 5);
		String str = stream.map(String::valueOf).collect(Collectors.joining("-"));
		System.out.println("평균 : " + avg);
		System.out.println("제곱값의 평균 : " + sqrt);
		System.out.println("원소 문자열 : " + str);
	}

}
