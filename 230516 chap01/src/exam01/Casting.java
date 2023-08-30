package exam01;

public class Casting { // 명시적 형변환

	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
		int result = x + y;
		// println 사용해서 출력
		System.out.println(x + "+" + y + " = " + result);
		// printf 사용해서 출력
		System.out.printf("%d + %d = %d\n", x, y, result);
		byte bResult = (byte) (x + y); // +연산은 int
		System.out.println(bResult);

		int iValue = 10;
		double dValue = 3.14;
		double dResult = iValue + dValue;
		System.out.println(dResult);
		result = iValue + (int) dValue;
		System.out.println(result);

		dValue = 3.14 + 8.99;
		System.out.println(dValue);
		float fValue = 3.14f + 8.89f;
		System.out.println(fValue);

		int iX = 1;
		int iY = 2;
//		dResult = (double) iX / (double) iY;
		dResult = (double) iX / iY;
		dResult = iX / (double) iY;
		System.out.println(dResult); // 0.5

		String str = "3" + iX + iY;
		System.out.println(str); // 312
		str = iX + "3" + iY;
		System.out.println(str); // 132
		str = iX + iY + "3";
		System.out.println(str); // 33 순서가 중요함

		str = "10";
//		str = "kim";
//		iX = (int) str; string은 클래스 기본8가지 타입에 해당하지않음
		// String->int
		iX = Integer.parseInt(str); // int 리턴하는 래퍼클래스
		System.out.println(iX);
		// String -> byte;
		x = Byte.parseByte(str);
		System.out.println(x);
		//
		dValue = Double.parseDouble(str);
		System.out.println(dValue);

		// int -> string
		str = String.valueOf(iX); // string 리턴
		System.out.println(str);

		iX = -iX;
		System.out.println(iX);
		
		bResult = (byte) -bResult;
		int bResult2 = -bResult;
		
		System.out.println(bResult);
		
		System.out.println(iX);
		int result1 = ++iX + 10;
		System.out.println("iX = " + iX + " result = " + result1);
		
		System.out.println(iY);
		result1 = iY++ + 10;
		System.out.println("iY = " + iY + " result = " + result1);
		
		//삼항연산자
		String str01 = (iX > 0)? "iX는 양수입니다. " : "iX는 0또는 음수입니다.";
		System.out.println(str01);
	}

}
