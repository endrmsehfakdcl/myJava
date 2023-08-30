package practice.ex07;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//07. 문자열 리스트("민국","지우","하준","지우")가 있다.
//다음 실행 결과와 같이 문자열 빈도수로 구성된 Map타입으로 수집한 후 출력하는 프로그램을 작성하시오.
//== 출력결과 : {하준=2, 민국=1, 지우=3}
public class Exam07 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("민국", "지우", "하준", "지우");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), Collections.frequency(list, list.get(i)));
		}
		System.out.println(map);

	}
}
