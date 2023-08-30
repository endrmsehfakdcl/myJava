package exam06;

import java.util.Comparator;

interface UseThis {
	void use();
}

public class UseThisTest {

	public void lambda() {
		String hello = "Hello!";

		UseThis u1 = new UseThis() {
			@Override
			public void use() {
				System.out.println(this); // 무명 객체 exam06.UseThisTest$1@1eb44e46
				System.out.println(hello); // Hello! 로컬 변수 hello는 사용 가능
				// Local variable hello defined in an enclosing scope must be final or
				// effectively final == 재할당 불가
//				hello = "Anonymous";
			}
		};
		u1.use();

		UseThis u2 = () -> {
			System.out.println(this); // UseThisTest
			System.out.println(hello); // Hello!
			// Local variable hello defined in an enclosing scope must be final or
			// effectively final
//			hello = "Anonymous"; 
		};
		u2.use();
	}

	@Override
	public String toString() {
		return "UseThisTest";
	}

	public static void main(String[] args) {
		int one = 1;
		new UseThisTest().lambda();
		// Lambda expression's parameter one cannot redeclare another local variable
		// defined in an enclosing scope. 지역변수 람다식에 못 넣음 ㅅㄱ
//		Comparator<String> c = (one, two) -> one.length() - two.length();
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();

	}
}
