package exam14to18;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println("정사각형의 넓이 : " + cal.areaRectagle(3));
		System.out.println("직사각형의 넓이 : " + cal.areaRectagle2(3, 5));
	}

}
