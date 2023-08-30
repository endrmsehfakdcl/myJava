package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionsSortTest {
	public static void main(String[] args) {

		String[] fruits = { "복숭아", "사과", "바나나", "망고", "키위", "바나나" };

		List<String> list = Arrays.asList(fruits);

		System.out.println(list);

		Collections.sort(list);
		System.out.println("sort : " + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverseOrder : " + list);

		Collections.reverse(list);
		System.out.println("reverse : " + list);

		Collections.rotate(list, 2);
		System.out.println("rotate : " + list);

		Collections.shuffle(list);
		System.out.println("shuffle : " + list);

		System.out.println();

		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, "사과");
		System.out.println(i);

		HashSet<String> set = new HashSet<>(list);
		List<String> list2 = new ArrayList<>(set); // 중복을 제거함
		System.out.println(list2);
		System.out.println();

//		list.add(0, "사과"); //Exception in thread "main" java.lang.UnsupportedOperationException
//		at java.base/java.util.AbstractList.add(AbstractList.java:153)
//		at exam02.CollectionsSortTest.main(CollectionsSortTest.java:44)

		for (String fruit : list2) {
			System.out.println(fruit + " : " + Collections.frequency(list, fruit));
		}
	}
}
