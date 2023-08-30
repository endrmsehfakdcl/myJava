package exam06;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.add(new Member("김자바", 30));
		set.add(new Member("김자바", 30)); 

		System.out.println(set.size());
	}
}
