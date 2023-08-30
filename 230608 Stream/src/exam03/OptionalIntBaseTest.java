package exam03;

import java.util.OptionalInt;

public class OptionalIntBaseTest {
	public static void main(String[] args) {

		OptionalInt oi1 = OptionalInt.of(3);
		OptionalInt oi2 = OptionalInt.empty();

		System.out.print("[step 1.] ");
		oi1.ifPresent(i -> System.out.print(i + "\t"));
		oi2.ifPresent(i -> System.out.println(i));
		System.out.println();

		System.out.print("[step 2.] ");
		System.out.print(oi1.orElse(100) + "\t");
		System.out.println(oi2.orElse(100));
	}
}
