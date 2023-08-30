package exam01;

public class Anonymous1 {
	private int field;

	public void method(int arg1, int arg2) {
		int var1 = 1000;
		int var2 = 2000;

		field = 100;

//		var1 = 1000; // final 이므로 값이 바뀌지 않는다.
//		arg1 = 1000;

		// interface Calculatable 재젖
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
