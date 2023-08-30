package practice.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//06. 6개의 수도('서울', '워싱턴', '베이징', '파리', '마드리드', '런던')와 대응하는 인구 수(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9)를 포함하는 2개의 리스트 객체를 사용하여 다음을 수행하는 프로그램을 작성하라.
//
//1) 수도 이름과 인구 수를 나타내는 Population클래스를 작성하되 생성자와 모든 getter메소드를 정의하고, toString()메소드를 오버라이딩한다.
//2) 2개의 리스트로 Stream<Population>을 생성한다.
//3) 다음 실행 결과와 같이 인구 수가 300.0을 초과하는 나라와 인구 수를 출력한다.
//== 실행결과 : 서울(973.7)
//              베이징(2115.0)
//              마드리드(326.5)
//              런던(853.9)
public class Exam06 {
	public static void main(String[] args) {
		List<String> capital = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		List<Double> population = Arrays.asList(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9);
//		List<String> population = Arrays.asList("973.7", "63.2", "2115.0", "224.4", "326.5", "853.9");
//		Stream<List<String>> stream = Stream.of(capital, population);
//		Stream<Population> streamP = stream;
		List<Population> listP = new ArrayList<>();
		for (int i = 0; i < capital.size(); i++) {
			listP.add(new Population(capital.get(i), population.get(i)));
		}
//		Stream<Population> streamP = listP.stream().filter(s->s.getPopulation()>300.0);
//		streamP.forEach(System.out::println);
		listP.stream().filter(s -> s.getPopulation() > 300.0).forEach(System.out::println);
	}
}

class Population {
	private String capital;
	private double population;

	public Population(String capital, double population) {
		this.capital = capital;
		this.population = population;
	}

	public String getCapital() {
		return capital;
	}

	public double getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return capital + "(" + population + ")";
		// == 실행결과 : 서울(973.7)
//      베이징(2115.0)
//      마드리드(326.5)
//      런던(853.9)
	}

}
