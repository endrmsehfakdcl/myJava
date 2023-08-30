package practice.ex07;

import java.util.stream.IntStream;

//09. 피타고라스 정리를 만족하는 3 가지 정수로 구성된 집합을 생성하는 스트림을 생성하라.다음 실행 결과는 5 개의 집합을 나타낸 것이다.
//힌트)3 가지 정수 중 2 가지를 intStream.range()메소드로 제공할 수 있다.제공되는 두 정수에 대하여 z(=Math.sqrt(x*x+y*y))가 z%1==0 을 만족하는 z를 찾으면 된다.
//==출력 결과:(3,4,5)(5,12,13)(6,8,10)(7,24,25)(8,15,17)
public class Exam09 {
	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 100);
		IntStream is2 = IntStream.range(1, 100);
		
//		Object[] toArray()
//		Returns an array containing the elements of this stream.
//		This is a terminal operation.
//		Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		for (int x : is.toArray()) {
			is = IntStream.range(1, 100); // stream 매번 새로 생성
			for (int y : is2.toArray()) {
				is2 = IntStream.range(1, 100); // stream 매번 새로 생성
				double z = Math.sqrt(x * x + y * y);
				if (z % 1 == 0 & x < y) { // 중복 안되게 x<y
					int z_int = (int) z; // 5.0 으로 나오니까 형변환
					System.out.print("(" + x + "," + y + "," + z_int + ")");
				}
			}
		}
	}
}
