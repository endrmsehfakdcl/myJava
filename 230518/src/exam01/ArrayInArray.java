package exam01;

public class ArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열의 길이 [행][렬] > 참조영역이라 주소값만 들고있음
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]); // 초기값 0

			}
		}

		System.out.println();
		int[][] engScores = { { 95, 100 }, { 50, 90, 54 }, { 80, 90, 87, 65 } };

		for (int i = 0; i < engScores.length; i++) {
			for (int j = 0; j < engScores[i].length; j++) {
				System.out.println("engScores[" + i + "][" + j + "] = " + engScores[i][j]);
			}
		}
		
		System.out.println();
		int[][] korScores = new int[2][]; // 행은 2개 열은 ㅁ?ㄹ
		korScores[0] = new int[2]; // 0 0
		korScores[1] = new int[3]; // 0 0 0
		for (int i = 0; i < korScores.length; i++) {
			for (int j = 0; j < korScores[i].length; j++) {
				System.out.println("korScores[" + i + "][" + j + "]=" + korScores[i][j]);
			}
		}

	}

}
