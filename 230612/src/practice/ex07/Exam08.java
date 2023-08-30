package practice.ex07;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//08. Nation.nations 리스트를 육지나라 및 섬나라로 그룹핑하고, 각 그룹을 선진국 및 개도국 나라로 분류하여 다음 실행 결과처럼 출력하는 프로그램을 작성하시오. 단, 선진국은 GDP순위 12위까지로 가정한다.
//힌트) groupBy() 메소드의 인수로 groupBy()를 사용할 수 있다. ( 자바api참조)
//== { Land={선진국=[ROK, USA, Chia], 개도국=[MoroCCo]}, ISLAND={선진국=[United Kingdom], 개도국=[New Zealand, Philiphine, Sri Lanka]}}
public class Exam08 {
	public static void main(String[] args) {

		Stream<Nation> stream = Nation.nations.stream();
//		stream.collect(Collectors.groupingBy(s->s.getGdpRank()>=12));
		
//		groupingBy(classifier, toList());
//		 Map<City, Set<String>> namesByCity
//		   = people.stream().collect(
//		     groupingBy(Person::getCity,
//		                mapping(Person::getLastName,
//		                        toSet())));

		Map<Type, Map<String, List<String>>> result  
				= stream.collect(
						Collectors.groupingBy(Nation::getType,
								Collectors.groupingBy(nation -> {
									if (nation.getGdpRank() <= 12) {
										return "선진국";
									} else {
										return "개도국";
									}
								}, Collectors.mapping(Nation::getName, Collectors.toList())))); 
			System.out.println(result); 
			//{LAND={선진국=[ROK, USA, China], 개도국=[Morocco]}, ISLAND={선진국=[United Kingdom], 개도국=[New Zealand, Philiphine, Sri Lanka]}}
	}

}

//Stream으로 Nation에서 4개만 가져오기
//		Stream<Nation> s1 = Nation.nations.stream().limit(4);
//		// Type에 따라 grouping 하기 때문에 Map으로 처리함
//		Map<Type, List<Nation>> m1 = s1.collect(
//				Collectors.groupingBy(Nation::getType));
//		System.out.println(m1);
//		// ---------------------------------------------------------------------------------
//		s1 = Nation.nations.stream().limit(4);
//		// Collectors.counting 은 long타입을 반환한다.
//		Map<Type, Long> m2 = s1.collect(
//				Collectors.groupingBy(Nation::getType, Collectors.counting()));
//		System.out.println(m2);
//		// ---------------------------------------------------------------------------------
//		s1 = Nation.nations.stream().limit(4);
//		Map<Type, String> m3 = s1.collect(
//				Collectors.groupingBy(Nation::getType, Collectors.mapping(Nation::getName, Collectors.joining(", "))));
//		System.out.println(m3);