package exam04_after_generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java"); // 0
		list.add("DataBase"); // 1
		list.add("Jsp/Servlet"); // 2->3
		list.add(2, "iBatis"); // 2
		list.add("React"); // 4

		System.out.println(list.size());
		System.out.println();

		System.out.println(list.get(2)); // iBatis
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		list.remove(2); // iBatis
		list.remove(2); // Jsp/Servlet
		list.remove("iBatis");

		for (String s : list) {
			System.out.println(s);
		}

	}
}
