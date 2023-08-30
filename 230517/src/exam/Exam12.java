package exam;

public class Exam12 {

	public static void main(String[] args) {
//12. 다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.
//		   A B
//		 + B A
//		----------
//		   9 9
		System.out.println("(A, B)");
		System.out.println("------");
		for (int A = 1; A < 10; A++) {
			for (int B = 1; B < 10; B++) {
				if (10 * A + B + 10 * B + A == 99) {
					System.out.println("(" + A +", "+ B + ")");
				}
			}
		}

	}

}
