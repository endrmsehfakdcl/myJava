package exam01;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. 각 변의 길이의 합이 20이하, 각변의 길이가 정수인 직각 삼각형의 변
		int a, b, c;
		for (a = 1; a < 30; a++) {
			for (b = 1; b < 30; b++) {
				for (c = 1; c < 30; c++) {
					if (a + b + c <= 20 & a * a + b * b == c * c) {
						System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
					}
				}
			}
		}
	}

}
