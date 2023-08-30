package exam07;

import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> fruits = Map.of("사과", 10, "바나나", 30, "딸기", 30, "키위", 10, "복숭아", 50);
		System.out.println(fruits.size() + "종류의 과일이 있습니다.");
		System.out.println(fruits);
		
		for(String key : fruits.keySet()) {
			System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");
		}
		
		String key = "복숭아";
		if(fruits.containsKey(key)) {
			System.out.println(key +" : " + fruits.get(key));
		}
	}
}
