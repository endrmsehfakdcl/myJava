package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("김자바", 90); 
		map.put("강자바", 80);
		map.put("박자바", 76);
		map.put("김자바", 95);
		map.put("홍자바", 85);

		System.out.println(map.size());
		System.out.println("김자바 : " + map.get("김자바")); // 90 -> 95 덮어씀

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}

		System.out.println();
		map.remove("김자바");
		System.out.println(map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		// entrySet에 의존적인 entryIterator

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}
		System.out.println();

		map.clear();
		System.out.println(map.size());
	}
}
