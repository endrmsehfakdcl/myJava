package exam05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("iBatis");

		System.out.println(set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println("set.remove(\"JDBC\");");
		System.out.println("set.remove(\"iBatis\");");
		System.out.println(set.size());

		iterator = set.iterator();
		for (String string : set) {
			System.out.println(set);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("set이 비어있음.");
		}

	}
}
