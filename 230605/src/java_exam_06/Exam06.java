package java_exam_06;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

//06. HashMap의 원소는 키로 한글 동물 이름, 값으로 소문자 영어 동물 이름으로 구성되어 있는데, 다음 실행 결과가 나타나도록 Map 인터페이스의 replaceAll()를 사용하여 프로그램하라.
//
//== 결과 : 변경 전 : {호랑이=tiger, 표범=leopard, 사자=lion}
//	  변경 후 : {호랑이=TIGER, 표범=LEOPART, 사자=LION}
public class Exam06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("호랑이", "tiger");
		map.put("표범", "leopard");
		map.put("사자", "lion");
		System.out.println(map);

//		replaceAll​(BiFunction<? super K,​? super V,​? extends V> function)
		map.replaceAll(new BiFunction<String, String, String>() {
			@Override
			public String apply(String key, String value) {
				value = value.toUpperCase();
				return value;
			}
		});
		
//		람다식을 쓴다면?
//		map.replaceAll((s1, s2) -> s2.toUpperCase());
		
		System.out.println(map);

	}
}
