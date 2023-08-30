package exam05;

@FunctionalInterface
interface Negative {
	int neg(int x);
}

@FunctionalInterface
interface Printable {
	void print();
}

public class LambdaTest {
	public static void main(String[] args) {
		Negative n;
		Printable p;

		// 익명
		n = new Negative() {
			@Override
			public int neg(int x) {
				return -x;
			}
		};

		// 람다식
		n = (int x) -> {
			return -x;
		};

		n = (x) -> -x;

		// 익명
		p = new Printable() {
			@Override
			public void print() {
				System.out.println("Hello!");
			}
		};

		// 람다식
		p = () -> {
			System.out.println("Hello!");
		};

		p = () -> System.out.println("Hello!");

//		s -> Integer.parseInt(s);
	}
}
