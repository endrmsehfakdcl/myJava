package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {
	public static void main(String[] args) {

		IntUnaryOperator add = x -> x + 2;
		System.out.println(add.applyAsInt(30));

		UnaryOperator<Integer> add2 = x -> x + 2;
		System.out.println(add2.apply(3));

		IntUnaryOperator mul = x -> x * 2;

		IntUnaryOperator addmul = add.andThen(mul);
		System.out.println("(30+2)*2 = " + addmul.applyAsInt(30));

		IntBinaryOperator add3 = (x, y) -> x + y;
		System.out.println(add3.applyAsInt(10, 20));

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(7);
		list.replaceAll(e -> e + 10); // 5 6 7 -> 15 16 17
		System.out.println(list);
	}
}
